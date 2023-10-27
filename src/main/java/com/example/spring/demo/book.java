package com.example.spring.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class book {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Long id ; 
	private String title; 
	private String author; 
	
	public book() {
		
    }
	
	
	
	public book(Long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getAuthor() {
		return author;
	}





	public void setAuthor(String author) {
		this.author = author;
	}






}