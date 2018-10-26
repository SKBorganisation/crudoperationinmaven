package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Login;
import com.model.Role;
import com.model.User;
import com.service.Serviceinterface;

@Controller
public class Homecontroller
{
	@Autowired
	Serviceinterface service;
	@RequestMapping("/")
	public String loginPage()
	{
		System.out.println("on login page...");
		return "login";
	}
	
	@RequestMapping("/registerPage")
	public String registerPage()
	{
		System.out.println("on register page..");
		return "register";
	}
	
	@RequestMapping("/registeruser")
	public String register(@ModelAttribute User u,@ModelAttribute Login login, @ModelAttribute Role r,Model model)
	{
		
		System.out.println("on register user");
		Role role=service.getRolename(r);
		System.out.println("rolename="+role.getRolename());
		login.setRole(role);
		//u.setLogin(login);
		System.out.println(login.getUname());
		System.out.println(login.getPassword()+"password");
		u.setLogin(login);
	   	service.saveUser(u);
	   	System.out.println("user registered...");
	   	model.addAttribute("msg", "Registered successfully...");
		return "login";
	}
}
