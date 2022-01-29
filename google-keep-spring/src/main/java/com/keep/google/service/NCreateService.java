package com.keep.google.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.keep.google.dao.NDao;

public class NCreateService implements NService {

	NDao dao = new NDao();
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		String pin = request.getParameter("pin");
		String color = request.getParameter("color");
		Date time = new Date(System.currentTimeMillis());
		
		System.out.println(title);
		System.out.println(body);
		System.out.println(pin);
		System.out.println(color);
		System.out.println(time);
		
		dao.create(title,body,pin,color,time);
	}

}
