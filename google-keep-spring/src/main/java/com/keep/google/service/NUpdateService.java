package com.keep.google.service;

import java.sql.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.keep.google.dao.NDao;

public class NUpdateService implements NService {

	
	NDao dao = new NDao();
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String color = request.getParameter("color");
		String pin = request.getParameter("pinned");
		
		dao.update(id, color, pin);
	}

}
