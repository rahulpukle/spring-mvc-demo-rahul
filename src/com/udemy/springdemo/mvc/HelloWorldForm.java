package com.udemy.springdemo.mvc;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloWorldForm {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model)  {
		String movieBigName = request.getParameter("movieName");
		model.addAttribute("movieModel",movieBigName.toUpperCase()+" hi");
		return "helloworld";
	}
}
