package com.trungjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.trrungtamjava.model.Food;

public class FoodDaoImpl extends JDBCConnection implements FoodDao {

	@Override
	public void add(Food food) {
		// TODO Auto-generated method stub
		Connection conn = super.getConnection();
		try {
		String sql = "insert into food(name,price)\r\n" + "values(?,?)";
		
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1,food.getName());
		preparedStatement.setInt(2,food.getPrice());
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
	public void update(Food food) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Food get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
