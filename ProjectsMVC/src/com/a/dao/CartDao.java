package com.a.dao;

import java.util.List;

import com.a.model.Cart;
public interface CartDao {

	void create(Cart cart);
	
	void update(Cart cart);
	
	void delete(int id);
	
	Cart get(int id);
	
	List<Cart> search(int userId);
	
	List<Cart> search(String name);
}
