package com.yash.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.model.User;
import com.yash.model.UserDetail;
import com.yash.service.UserService;


@Controller
public class UserController {
//	
//	@Value("${welcome.message:test}")
//	private String message = "Hello World";
	
//	@RequestMapping("/")
//	public String welcome(Map<String, Object> model) {
//		model.put("message", this.message);
//		return "login";
//	}
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method =RequestMethod.GET)
	public String welcome(Model model) {
		//model.put("message", this.message);
		return "login";
	}
	
	@RequestMapping(value="/login",method =RequestMethod.POST)
	public String login(Model model, @ModelAttribute("userForm") User userForm) {
		model.addAttribute("userName",userForm.getUsername());
		List<User> users =userService.getListOfUsers();
		for(User u:users) {
			if(u.getUsername().equals(userForm.getUsername())&& u.getPassword().equals(userForm.getPassword())) {
				return "welcome";
			}
		}
		
		
		//model.addAttribute("userForm", new User());
		return "login";
	}
	
	@RequestMapping(value="/register",method =RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("userForm", new User());
		return "register";
	}
	
	@RequestMapping(value="/registration",method =RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") User userForm,@ModelAttribute("userDetail")UserDetail userDetail ,BindingResult bindingres, Model model) {
		
		if(bindingres.hasErrors()) {
			return "register";
		}
		userForm.setUserDetail(userDetail);
		userDetail.setUser(userForm);
		
		userService.save(userForm);
		model.addAttribute("userName", userForm.getUsername());
		return "welcome";
	}
	
	@RequestMapping(value="/userlist",method =RequestMethod.GET)
	public String getUsersList(@ModelAttribute("userForm") User userForm, BindingResult bindingres, Model model) {
		
		
		
		
		List<User> users=userService.getListOfUsers();
		model.addAttribute("users", users);
		
		return "UserList";
	}
	
	
	
	
	

}
