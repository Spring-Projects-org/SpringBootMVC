package com.spring.boot.mvc.SpringBootMVC.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.mvc.SpringBootMVC.component.User;

@Controller
public class HomeController {
	
	@Value("${spring.application.name}")
    String appName;
 
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("appName", appName);

		return "home";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		
		System.out.println("User Page Requested");
		model.addAttribute("PersonName", user.getName());
		model.addAttribute("Id", user.getId());
		return "user";
	}

}
