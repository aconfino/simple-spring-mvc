package com.confino.common.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/welcome.html")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("msg", "Welcome to the sample Spring MVC app");

		return model;
	}
	
	@RequestMapping("/currentTime.html")
	public ModelAndView congrats() {

		ModelAndView model = new ModelAndView("CurrentTimePage");
		model.addObject("msg", "Congratulations!");
		model.addObject("time", new Date());

		return model;
	}
}