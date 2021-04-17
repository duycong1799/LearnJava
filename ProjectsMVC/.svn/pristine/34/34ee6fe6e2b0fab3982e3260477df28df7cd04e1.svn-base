package com.a.dao;

import java.sql.SQLException;
import java.util.List;

import com.a.model.User;

public interface UserDao {

	void create(User user) throws SQLException;
	
	void update(User user);
	
	void delete(int id);
	
	void updateLoginCounter(int id, int counter);
	
	User get(int id);
	
	User get(String username);
	
	List<User> search(String name);
		
}
