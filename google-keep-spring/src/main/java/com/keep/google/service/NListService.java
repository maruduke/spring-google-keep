package com.keep.google.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.keep.google.dao.NDao;
import com.keep.google.dto.NDto;

@Service
public class NListService implements NService {

	NDao dao = new NDao();
	ArrayList<NDto> dtos= null;
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		dtos = dao.list();
		model.addAttribute("list", dtos);
	}

}
