package com.trungjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.trrungtamjava.model.User;

public class UserDaoImpl extends JDBCConnectionUser implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
		String sql = "insert into user(name,age)\r\n" + "values(?,?)";
		
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1,user.getName());
		preparedStatement.setInt(2,user.getAge());
		preparedStatement.executeUpdate();
		}catch(Exception ex) {
			System.out.println("Loi"+ ex);
		}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
