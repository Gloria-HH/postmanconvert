package com.demo.gen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import com.alibaba.fastjson.JSONObject;
import com.demo.postman.model.PostmanCollection;
import com.demo.postman.model.PostmanItem;
import com.demo.postman.model.PostmanQuery;
import com.demo.template.model.RequestItem;
import com.demo.template.model.RequestParam;
import com.demo.template.model.RequestModule;

public class GenUtil {
	private final static Logger log = LoggerFactory.getLogger(GenUtil.class);

	/**
	 * 模板
	 * 
	 * @return
	 */
	public static List<String> getTemplates() {
		return Arrays.asList("/templates/API.java.vm");
	}

	/**
	 * 获取配置信息
	 */
	public static Configuration getConfig() {
		try {
			return new PropertiesConfiguration("generator.properties");
		} catch (ConfigurationException e) {
			throw new RuntimeException("获取配置文件失败，", e);
		}
	}

	public JSONObject readJsonFile(String fileName) {
		String jsonStr;
		try {

			File file = new File(fileName);
			jsonStr = FileUtils.readFileToString(file, "UTF-8");
			JSONObject json = JSONObject.parseObject(jsonStr);
			return json;
		} catch (IOException e) {
			log.error("readJsonFile exception :", e);
			return null;
		}

	}

	/**
	 * 生成代码
	 */
	public static void generatorCode(PostmanCollection postmanCollection) {
		// 配置信息
		Configuration config = getConfig();
		Map<String, Object> map = new HashMap<>();
		map.put("package", config.getProperty("package"));
		map.put("moduleName", config.getProperty("moduleName"));
		map.put("author", config.getProperty("author"));
		map.put("email", config.getProperty("email"));

		RequestModule module = new RequestModule();
		module.setClazzName(postmanCollection.getInfo().getName());
		List<RequestItem> requestItems = new ArrayList<RequestItem>();
		for (PostmanItem item : postmanCollection.getItem()) {
			RequestItem reqItem = new RequestItem();
			reqItem.setName(item.getName());
			reqItem.setMethod(item.getRequest().getMethod().toLowerCase());
			reqItem.setPath(item.getRequest().getUrl().getPath().get(0));
			List<RequestParam> requestParams = new ArrayList<RequestParam>();
			for (PostmanQuery queryItem : item.getRequest().getUrl().getQuery()) {
				RequestParam requestParam = new RequestParam();
				requestParam.setKey(queryItem.getKey());
				requestParam.setValue(queryItem.getValue());
				requestParams.add(requestParam);
			}
			reqItem.setParams(requestParams);
			requestItems.add(reqItem);
		}
		module.setItems(requestItems);
		map.put("module", module);
		VelocityContext context = new VelocityContext(map);
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class",
				ClasspathResourceLoader.class.getName());
		ve.init();
		// 获取模板列表
		List<String> templates = getTemplates();
		for (String template : templates) {
			// 渲染模板
			StringWriter sw = new StringWriter();
			Template tpl = ve.getTemplate(template, "UTF-8");
			tpl.merge(context, sw);
			// 生成文件
			String relativelyPath = System.getProperty("user.dir");
			genFile(relativelyPath+"/src/main/resources/static" + module.getClazzName()
					+ "Test.java", sw);

		}

	}

	public static void genFile(String fileName, StringWriter stringWriter) {
		File file = new File(fileName);
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file);
			fileWriter.write(stringWriter.toString());
			fileWriter.close();
		} catch (IOException e) {
			log.error("genFile error,", e);
		}

	}

	public static void main(String[] args) {
		String relativelyPath = System.getProperty("user.dir");
		GenUtil genUtil = new GenUtil();
		// postman json路径
		String fileName = relativelyPath
				+ "/src/main/resources/static/json/QueryUser.postman_collection.json";
		JSONObject jsonObject = genUtil.readJsonFile(fileName);
		PostmanCollection postmanCollection = (PostmanCollection) JSONObject
				.toJavaObject(jsonObject, PostmanCollection.class);
		generatorCode(postmanCollection);

	}

}
