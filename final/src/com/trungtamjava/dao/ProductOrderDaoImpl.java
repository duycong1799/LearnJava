package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Product;
import com.trungtamjava.model.ProductOrder;

public class ProductOrderDaoImpl extends JDBCConnection implements ProductOrderDao {

	@Override
	public void add(ProductOrder productOrder) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO " + "product_order(quantity, price,product_id,name) " + "VALUES (?,?,?,?);";

		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, productOrder.getQuantity());
			preparedStatement.setInt(2, productOrder.getPrice());
			preparedStatement.setInt(3, productOrder.getProduct().getId());
			preparedStatement.setString(4, productOrder.getName());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

	}

	@Override
	public void update(ProductOrder productOrder) {
		// TODO Auto-generated method stub
		String sql = "UPDATE product_order SET quantity = ?, price = ?, product_id = ?" + " WHERE id = ?";

		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, productOrder.getQuantity());
			preparedStatement.setInt(2, productOrder.getPrice());
			preparedStatement.setInt(3, productOrder.getProduct().getId());
			preparedStatement.setInt(4, productOrder.getId());

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM product_order WHERE id = ?";

		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

	}

	@Override
	public ProductOrder get(int id) {
		String sql = "SELECT pr.id AS 'order_id',p.name,pr.price,pr.quantity, p.id AS 'product_id' FROM product_order pr INNER JOIN product p ON pr.product_id = p.id WHERE pr.id = ?";

		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductOrder productOrder = new ProductOrder();

				productOrder.setId(resultSet.getInt("order_id"));
				productOrder.setQuantity(resultSet.getInt("quantity"));
				productOrder.setPrice(resultSet.getInt("price"));

				Product product = new Product();
				product.setId(resultSet.getInt("product_id"));
				product.setName(resultSet.getString("name"));

				productOrder.setProduct(product);

				return productOrder;
			}

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

		return null;
	}

	@Override
	public List<ProductOrder> search(String productname) {
		List<ProductOrder> productOrders = new ArrayList<>();

		Connection conn = super.getConnection();
		try {
			String sql = "SELECT pr.id AS 'order_id',p.name,pr.price,pr.quantity, p.id AS 'product_id' FROM product_order pr INNER JOIN product p ON pr.product_id = p.id WHERE pr.name LIKE ?";

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
	}

}
