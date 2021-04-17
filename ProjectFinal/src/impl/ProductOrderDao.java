package impl;

import java.util.List;



import product.ProductOrder;

public interface ProductOrderDao {
	void add(ProductOrder productOrder);

	void update(ProductOrder productOrder);

	void delete(int id);

	ProductOrder get(int id);

	List<ProductOrder> search(String productName);
}
