package com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class BOOK {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="books")
	private int id;
	private String title;
	private String author;
	public BOOK(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BOOK [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	public BOOK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
