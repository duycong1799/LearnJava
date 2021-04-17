package com.trungjava.dao;

import java.util.List;

import com.trrungtamjava.model.Food;

public interface FoodDao {
	void add(Food food);

	void update(Food food);

	void delete(int id);

	Food get(int id);

	List<Food> search(String name);

}
