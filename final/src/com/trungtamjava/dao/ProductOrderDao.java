package com.trungtamjava.dao;

import java.util.List;

import com.trungtamjava.model.ProductOrder;

public interface ProductOrderDao {
	void add(ProductOrder productOrder);

	void update(ProductOrder productOrder);

	void delete(int id);

	ProductOrder get(int id);

	List<ProductOrder> search(String productname);

}
