package com.keep.google.dto;

import java.sql.Timestamp;

public class NDto {
	int id;
	String title;
	String body;
	boolean pinned;
	String backgroundColor;
	Timestamp createdAt;
	Timestamp updatedAt;
	
	public NDto()
	{
		
	}
	
	public NDto(int id, String title, String body, boolean pinned, String backgroundColor, Timestamp createdAt, Timestamp updatedAt)
	{
		this.id = id;
		this.title = title;
		this.body = body;
		this.pinned = pinned;
		this.backgroundColor = backgroundColor;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public String toString()
	{
		return "id: "+ id+ "title: "+ title + "body: "+ body;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	
	public String getBackgroundColor() {
		return backgroundColor;
	}
	
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
