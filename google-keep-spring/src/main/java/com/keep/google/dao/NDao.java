package com.keep.google.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.keep.google.dto.NDto;
import com.keep.google.util.Constant;


@Repository
public class NDao {
	
	JdbcTemplate template = null;

	
	public NDao(){
		this.template = Constant.template;
	}
	
	
	public ArrayList<NDto> list()
	{
		String query = "SELECT id,title,body,pinned,backgroundcolor,createdAt,updatedAt FROM note";
		return (ArrayList<NDto>)template.query(query, new BeanPropertyRowMapper<NDto>(NDto.class));
	}
	
	public void create(final String title,final String body, final String pin, final String color, final Date time)
	{
			
					
			String query = "INSERT INTO note (id,title,body,pinned,backgroundcolor,createdAt,updatedAt) values (note_seq.nextval,?,?,?,?,?,?)";
			String pinned = pin.equals("false")?"0":"1";
			
			System.out.println(pinned);
			
			template.update(query,title,body,pinned,color,time,time);

	}
	
	public void delete(final String id)
	{
		String query = "DELETE FROM note WHERE id=?";
		
		template.update(query,id);
	}
}
