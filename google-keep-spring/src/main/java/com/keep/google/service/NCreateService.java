package com.keep.google.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.keep.google.dao.NDao;

public class NCreateService implements NService {

	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		String pin = request.getParameter("pin");
		String color = request.getParameter("color");
		
		NDao dao = new NDao();
		
	}

}
