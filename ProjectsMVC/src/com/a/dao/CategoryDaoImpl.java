package com.a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.a.jdbcConnection.jdbcConnection;
import com.a.model.Category;
import com.a.model.Product;

public class CategoryDaoImpl extends jdbcConnection implements CategoryDao {

	@Override
	public void create(Category category) {
		String sql = "insert into category(name) values(?)";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, category.getName());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Category category) {
		String sql = "UPDATE category SET name=? WHERE id=?";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, category.getName());
			preparedStatement.setInt(2, category.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM category WHERE id = ?;";

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
	public Category get(int id) {
		try {
			String sql = "SELECT * from category WHERE id = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				Category category = rowMapper(rs);
				return category;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;

	}

	@Override
	public Category get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> search(String name) {
		List<Category> categories = new ArrayList<Category>();

		String sql = "SELECT *  from category WHERE name LIKE ?";

		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, "%" + name + "%");

			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Category category = rowMapper(rs);
				categories.add(category);
			}
		} catch (SQLException e) {
			System.out.println("Loi " + e);
		}

		return categories;
	}

	private Category rowMapper(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		Category category = new Category();
		category.setId(id);
		category.setName(name);
		return category;
	}

}
