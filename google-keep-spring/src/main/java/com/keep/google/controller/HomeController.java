package com.keep.google.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keep.google.service.NCreateService;
import com.keep.google.service.NDeleteService;
import com.keep.google.service.NListService;
import com.keep.google.service.NService;
import com.keep.google.service.NUpdateService;
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
	
	@RequestMapping("/create")
	public String create(HttpServletRequest request, Model model)
	{
		model.addAttribute("request",request);
		service = new NCreateService();
		System.out.println("create");
		service.execute(model);
		return "redirect:/";
	}
	
	@RequestMapping("/correction")
	public String correction(HttpServletRequest request, Model model)
	{
		String deleted = request.getParameter("deleted");
		model.addAttribute("request", request);
		
		if(deleted.equals("1"))
		{
			service = new NDeleteService();
			service.execute(model);
		}
		
		else
		{
			service = new NUpdateService();
			service.execute(model);
		}
		
		return "redirect:/";
	}
}
