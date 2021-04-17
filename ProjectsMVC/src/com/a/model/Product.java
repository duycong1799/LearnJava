package com.a.model;

import java.io.Serializable;

public class Product implements Serializable {

	private int id;
	private String name;
	private int categoryId;
	private String description;
	private int price;
	private String note;
	private Category category;
	
	public Product() {
		super();
	}
	
	

	public Product(int id, String name, int categoryId, String categoryName, String description, int price, String note,
			Category category) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;		
		this.description = description;
		this.price = price;
		this.note = note;
		this.category = category;
	}


	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	
	
	
	
	
	
	
}
