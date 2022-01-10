package com.keep.google.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keep.google.service.NListService;
import com.keep.google.service.NService;
import com.keep.google.util.Constant;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	NService service = null;
	JdbcTemplate template = null;
	
	@Autowired	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping("/")
	public String home(Model model)
	{
		service = new NListService();
		service.execute(model);
		
		return "index";
	}
	
}
