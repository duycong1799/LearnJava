package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Product;
import com.trungtamjava.model.Category;

public class ProductDaoImpl extends JDBCConnection implements ProductDao {

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM product WHERE id = ?";

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
	public void create(Product product) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO product(name, description, price, note,categoryid) " + "VALUES (?,?,?, ?, ?);";
		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setString(1, product.getName());
			preparedStatement.setString(2, product.getDescription());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setString(4, product.getNote());
			preparedStatement.setInt(5, product.getCategory().getId());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}

	@Override
	public void update(Product product) {
		String sql = "UPDATE product SET name = ?, description = ?, price = ?, note = ?, categoryId = ? WHERE id = ?";
		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setString(1, product.getName());
			preparedStatement.setString(2, product.getDescription());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.setString(4, product.getNote());
			preparedStatement.setInt(5, product.getCategoryId());
			preparedStatement.setInt(6, product.getId());

			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM product WHERE id = ?";

		try {
			Connection conn = super.getConnection();

			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Product product = new Product();

				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getInt("price"));
				product.setNote(resultSet.getString("note"));

				return product;
			}

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

		return null;
	}

	@Override
	public Product get(String name) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM product WHERE name = ?";

		try {
			Connection conn = super.getConnection();

			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setString(1, name);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Product product = new Product();

				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getInt("price"));
				product.setNote(resultSet.getString("age"));

				return product;
			}

		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

		return null;
	}

	@Override
	public List<Product> search(String name) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();

		String sql="SELECT p.*,c.name as 'c_name' from product p inner join category c ON p.categoryId = c.id WHERE p.name LIKE ?";
		try {
			Connection conn = super.getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(sql);

			preparedStatement.setString(1, "%" + name + "%");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Product product = new Product();

				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getInt("price"));
				product.setNote(resultSet.getString("note"));

				Category category = new Category();
				category.setId(resultSet.getInt("categoryId"));
				category.setName(resultSet.getString("c_name"));
				product.setCategory(category);

				products.add(product);
			}
		} catch (Exception e) {
			System.out.println("Loi: " + e);
		}

		return products;
	}
}
