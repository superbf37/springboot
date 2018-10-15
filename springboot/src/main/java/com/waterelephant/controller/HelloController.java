package com.waterelephant.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.waterelephant.pojo.Resource;

@Controller
public class HelloController {
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String  hello() {
		return "hello springboot";
	}
	@RequestMapping("/getResource")
	@ResponseBody
	public Resource getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return bean;
	}

	@RequestMapping("/bye")
	@ResponseBody
	public String  bye() {

		System.out.println("master");

		System.out.println("test branch");

		return "goodbye";
	}
	
	
}
