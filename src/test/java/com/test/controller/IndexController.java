package com.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.test.pojo.User;
import com.test.service.IUserService;


@Controller
public class IndexController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/home")
	public String index(Model model){
		return "home";
		
	}
	@RequestMapping("/test")
	public @ResponseBody String test(Model model){
		return "yes";
		
	}
	@RequestMapping("/helloAll")
	public @ResponseBody List<User> greeting(){
		
		return userService.findUser();
	}
	@RequestMapping("/helloOne")
	public @ResponseBody List<User> greeting2(){
		PageHelper.offsetPage(2, 2);
		List<User> user=userService.findUser();
		return user;
	}
	@RequestMapping("/helloOne1")
	public @ResponseBody List<User> greeting3(){
		PageHelper.startPage(2, 3);
		List<User> user=userService.findUser();
		return user;
	}

}
