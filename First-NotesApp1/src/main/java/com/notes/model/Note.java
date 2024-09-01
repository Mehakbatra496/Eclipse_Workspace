package com.notes.model;

import java.sql.Timestamp;

public class Note {
    private int id;        // auto increment
    private String title;
    private String content;
    private Timestamp createdAt;  // current timestamp

    public Note() {}

    
    
    public Note(int id, String title, String content, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }

    // Getters and setters
    public int getId()
	{
	return id; 
	}
    
    
    public void setId(int id)
    { 
    	this.id = id;
    }

    public String getTitle() 
    {
    	return title; 
    }
    
    public void setTitle(String title) 
    {
    	this.title = title; 
    }

    public String getContent()
    {
    	return content; 
    }
   
    public void setContent(String content) 
    { 
    	this.content = content;
    }

    public Timestamp getCreatedAt()
    {
    	return createdAt; 
    }
    
    public void setCreatedAt(Timestamp createdAt)
    {
    	this.createdAt = createdAt;
    }
}
