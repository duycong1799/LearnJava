package com.trungtamjava.dao;

import java.util.List;

import com.trungtamjava.model.Category;

public interface CategoryDao {

	void create(Category category);
	
	void update(Category category);
	
	void delete(int id);
	
	Category get(int id);
	
	Category get(String name);
	
	List<Category> search(String name);
}
