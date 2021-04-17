package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Product;
import com.trungtamjava.model.ProductOrder;

public class Nhap {
	search:
		List<ProductOrder> productOrders = new ArrayList<>();

Connection conn = super.getConnection();
try {
	String sql = "SELECT pr.id AS 'order_id',p.name,pr.price,pr.quantity, p.id AS 'product_id' FROM product_order pr INNER JOIN product p ON pr.productid = p.id WHERE pr.name LIKE ?";

	PreparedStatement preparedStatement = conn.prepareStatement(sql);
	preparedStatement.setString(1, "%" + productname + "%");

	//// doc ket qua tra ve
	ResultSet rs = preparedStatement.executeQuery();
	while (rs.next()) {
		ProductOrder productOrder = new ProductOrder();

		productOrder.setId(rs.getInt("id"));
		productOrder.setQuantity(rs.getInt("quantity"));
		productOrder.setPrice(rs.getInt("price"));
		
		Product product = new Product();
		product.setId(rs.getInt("product_id"));
		product.setName(rs.getString("name"));
		
		productOrder.setProduct(product);

		productOrders.add(productOrder);
	}
} catch (Exception ex) {
	System.out.println("Loi " + ex);
} 

return productOrders;


get:
	Connection conn = super.getConnection();
try {
	String sql = "SELECT pr.id AS 'order_id',p.name,pr.price,pr.quantity, p.id AS 'product_id' FROM product_order pr INNER JOIN product p ON pr.productid = p.id WHERE pr.id = ?";

	PreparedStatement preparedStatement = conn.prepareStatement(sql);
	preparedStatement.setInt(1, id);

	//// doc ket qua tra ve
	ResultSet rs = preparedStatement.executeQuery();
	while (rs.next()) {
		Product product = new Product();

		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getInt("price"));

		return product;
	}

} catch (Exception ex) {
	System.out.println("Loi " + ex);
} finally {
	try {
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
return null;
}



}
