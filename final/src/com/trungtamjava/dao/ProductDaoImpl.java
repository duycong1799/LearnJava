package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.trungtamjava.model.Product;

public class ProductDaoImpl extends JDBCConnection implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
			String sql = "INSERT INTO product(name, price) VALUES (?,?)";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());

			preparedStatement.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Loi " + ex);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
			String sql = "UPDATE product SET name = ?, price = ? WHERE id = ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, product.getId());

			preparedStatement.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Loi " + ex);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
			String sql = "DELETE FROM product WHERE id = ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (Exception ex) {
			System.out.println("Loi " + ex);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
			String sql = "SELECT * FROM product WHERE id = ?";

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

	@Override
	public List<Product> search(String name) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();

		Connection conn = super.getConnection();
		try {
			String sql = "SELECT * FROM product WHERE name LIKE ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, "%" + name + "%");

			//// doc ket qua tra ve
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product product = new Product();

				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));

				products.add(product);
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

		return products;
	}
}
