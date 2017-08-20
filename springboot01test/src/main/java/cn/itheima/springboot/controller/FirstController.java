package cn.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itheima.springboot.service.UserService;

@Controller//@RestController相当于@Controller和@ResponseBody结合
public class FirstController {

	
	@Autowired
	private UserService userService;
	@Autowired
	private Environment en;
	//读取核心配置文件方式二
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	//@GetMapping相当于@Mapping指定了Get请求
	@GetMapping("/first1")
	public String first(){
		//读取核心配置文件方式一
		System.out.println(en.getProperty("name"));
		System.out.println(en.getProperty("url"));
		System.out.println(name);
		System.out.println(url);
		return "第一个springboot项目";
	}
	
	
	@GetMapping("/notice")
	public String user(){
		userService.queryById();
		return "/html/notice.html";
	}
	
}
