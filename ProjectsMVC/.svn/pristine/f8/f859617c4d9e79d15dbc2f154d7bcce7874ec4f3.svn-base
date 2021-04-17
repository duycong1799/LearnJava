package com.a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.a.jdbcConnection.jdbcConnection;
import com.a.model.Category;
import com.a.model.Product;
import com.a.model.User;

public class ProductDaoImpl extends jdbcConnection implements ProductDao{

	@Override
	public void create(Product product) {
		
		try {
			String sql = "INSERT INTO product(name, categoryId, description, price, note ) VALUES(?, ?, ?, ?, ?);";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, product.getName());
			statement.setInt(2, product.getCategoryId());
			statement.setString(3, product.getDescription());
			statement.setInt(4, product.getPrice());
			statement.setString(5, product.getNote());										
			/// GUI CAU LENH DI
			statement.executeUpdate();

			/// LAY VE ID TU GEN SET VAO car
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);// id dc gen o db
				// set vao doi tuong de su dung trong class khac
				product.setId(id);
			}
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
	}

	@Override
	public void update(Product product) {
		try {
			String sql = "UPDATE product SET name = ?, categoryId = ?, description = ?, price = ?, note = ? WHERE id = ?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			
			statement.setString(1, product.getName());
			statement.setInt(2, product.getCategoryId());
			statement.setString(3, product.getDescription());
			statement.setInt(4, product.getPrice());
			statement.setString(5, product.getNote());
			statement.setInt(6, product.getId());
			
			
			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM product WHERE id = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
	}

	@Override
	public Product get(int id) {
		try {
			String sql = "SELECT p.*, c.name as 'c_name' FROM product p " + 
					     "INNER JOIN category c ON p.categoryId = c.id WHERE p.id = ?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				Product product = rowMapper(rs);
				Category category = new Category();
				category.setId(rs.getInt("categoryId"));
				category.setName(rs.getString("c_name"));
				product.setCategory(category);
				return product;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
		
	}

	@Override
	public Product get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> search(String name) {
		
		List<Product> product = new ArrayList<Product>();
		
		String sql="SELECT p.*,c.name as 'c_name' from product p inner join category c ON p.categoryId = c.id WHERE p.name LIKE ?";
		
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			
			statement.setString(1, "%"+ name + "%");
			
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				Product product1 = rowMapper(rs);
				Category category = new Category();
				category.setId(rs.getInt("categoryId"));
				category.setName(rs.getString("c_name"));
				product1.setCategory(category);
				product.add(product1);
			}
		} catch (SQLException e) {
			System.out.println("Loi " + e);
		}
		
		
		return product;
	}
	@Override
	public List<Product> getAll() {
		return null;
	}

	private Product rowMapper(ResultSet rs) throws SQLException {
		Product product = new Product();
		
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setCategoryId(rs.getInt("categoryId"));
		product.setDescription(rs.getString("description"));
		product.setPrice(rs.getInt("price"));
		product.setNote(rs.getString("note"));
		return product;
	}

	
	

}
