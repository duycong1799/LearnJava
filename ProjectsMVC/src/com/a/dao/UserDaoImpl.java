package com.a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.a.jdbcConnection.jdbcConnection;
import com.a.model.User;

public class UserDaoImpl extends jdbcConnection implements UserDao{

	@Override
	public void create(User user) throws SQLException {
					
		
		
			String sql = "INSERT INTO user(name, age, username, password, role , gender, image ) VALUES(?, ?, ?, ?, ?, ?, ?);";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			statement.setString(1, user.getName());
			statement.setInt(2, user.getAge());
			statement.setString(3, user.getUsername());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getRole());
			statement.setString(6, user.getGender());
			statement.setString(7, user.getUsername());									
			/// GUI CAU LENH DI
			statement.executeUpdate();

			/// LAY VE ID TU GEN SET VAO car
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);// id dc gen o db
				// set vao doi tuong de su dung trong class khac
				user.setId(id);	
	}
	}

	@Override
	public void update(User user) {
		try {
			String sql = "UPDATE user SET name = ?, age = ?, username = ?, password = ?, role = ?, gender = ?, image = ? WHERE id = ?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			
			statement.setString(1, user.getName());
			statement.setInt(2, user.getAge());
			statement.setString(3, user.getUsername());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getRole());
			statement.setString(6, user.getGender());
			statement.setString(7, user.getImage());	
			statement.setInt(8, user.getId());
			
			/// GUI CAU LENH DI
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM user WHERE id = ?;";

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
	public void updateLoginCounter(int id, int counter) {
		// TODO Auto-generated method stub
		System.out.println("ID " + id);
		System.out.println("Count " + counter);

		
		String sql = "Update user set login_counter = ? Where id=?";
		try {			
			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, counter);
			statement.setInt(2, id);
			statement.executeUpdate();	

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
	}

	@Override
	public User get(int id) {
		try {
			String sql = "SELECT * from user WHERE id = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				User user = rowMapper(rs);
				return user;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public User get(String username) {
		try {
			String sql = "SELECT * from user WHERE username = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, username);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				User user = rowMapper(rs);
				return user;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public List<User> search(String name) {
		List<User> users = new ArrayList<User>();

		try {
			String sql = "SELECT * from user WHERE name LIKE ? ";
			//"SELECT * FROM car WHERE name LIKE ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, "%" + name + "%");

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				User car = rowMapper(rs);
				users.add(car);// chen vao list
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return users;
	}
	
	private User rowMapper(ResultSet rs) throws Exception {
		/// get theo du lieu + ten cot sql ben trong
		int id = rs.getInt("id");
		String name = rs.getString("name");//
		int age = rs.getInt("age");
		String username = rs.getString("username");
		String password = rs.getString("password");		
		String role = rs.getString("role");
		String gender = rs.getString("gender");
		String image = rs.getString("image");
		
		User user = new User();	
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		user.setGender(gender);
		user.setImage(image);
		user.setLoginCounter(rs.getInt("login_counter"));//em ko set cai nay ra , thi luc nao cung mac dinh la 0.
		

		return user;
	}

	

	
}
