package com.a.dao;

import java.util.List;

import com.a.model.CartItems;


public interface CartItemsDao {
	void create(CartItems cartItems);
	
	void update(CartItems cartItems);
	
	void delete(int id);
	
	CartItems get(int id);
	
	List<CartItems> search(int cartId);
	
	List<CartItems> search(String name);
}
