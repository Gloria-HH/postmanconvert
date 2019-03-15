package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.demo.gen.GenUtil;
import com.demo.postman.model.PostmanCollection;

@RestController
public class IndexController {

	@RequestMapping(value = "")
	public String heloWord() {
		return "HelloWord";
	}
	

}
