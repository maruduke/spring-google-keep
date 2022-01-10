package com.keep.google.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.keep.google.dto.NDto;
import com.keep.google.util.Constant;


@Repository
public class NDao {
	
	JdbcTemplate template;

	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public NDao(){
		this.template = Constant.template;
		System.out.println("test");  
	}
	
	
	public ArrayList<NDto> list()
	{
		String query = "SELECT id,title,body,pinned,backgroundcolor,createdAt,updatedAt FROM note";
		return (ArrayList<NDto>)template.query(query, new BeanPropertyRowMapper<NDto>(NDto.class));
	}
	

}
