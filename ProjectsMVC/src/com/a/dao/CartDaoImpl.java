package com.a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.a.jdbcConnection.jdbcConnection;
import com.a.model.Cart;
import com.a.model.Category;
import com.a.model.User;

public class CartDaoImpl extends jdbcConnection implements CartDao  {

	@Override
	public void create(Cart cart) {
		String sql = "insert into cart(buyer,priceTotal,date) values(?,?,?)";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, cart.getBuyer().getId());
			preparedStatement.setLong(2, cart.getPriceTotal());
			preparedStatement.setString(3, cart.getDate());
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			if(rs.next()) {
				cart.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Cart cart) {
		String sql = "UPDATE cart SET buyer=?,priceTotal=?,date=? WHERE id=?";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, cart.getBuyer().getId());
			preparedStatement.setLong(2, cart.getPriceTotal());
			preparedStatement.setString(3, cart.getDate());
			preparedStatement.setInt(4, cart.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM cart WHERE id = ?;";

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
	public Cart get(int id) {
		try {
			String sql = "SELECT cart.id, cart.priceTotal, cart.date, user.name from cart inner join user on cart.buyer = user.id where cart.id=?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				int pid = rs.getInt("id");
				String buyername = rs.getString("name");
				int priceTotal = rs.getInt("priceTotal");
				String date = rs.getString("date");
				
				Cart cart = new Cart();
				cart.setId(pid);
				cart.setPriceTotal(priceTotal);
				cart.setDate(date);
				
				User buyer = new User();
				buyer.setName(buyername);
				cart.setBuyer(buyer);
				
				
				return cart;// tra ve doi tuong tim thay dau tien
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public List<Cart> search(int userId) {
		List<Cart> listCart = new ArrayList<Cart>();
		try {
			String sql = "SELECT cart.id, cart.priceTotal, cart.date, user.name from cart inner join user on cart.buyer = user.id where user.id=?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, userId);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				int pid = rs.getInt("id");
				String buyername = rs.getString("name");
				int priceTotal = rs.getInt("priceTotal");
				String date = rs.getString("date");
				
				Cart cart = new Cart();
				cart.setId(pid);
				cart.setPriceTotal(priceTotal);
				cart.setDate(date);
				
				User buyer = new User();
				buyer.setName(buyername);
				cart.setBuyer(buyer);
				listCart.add(cart);
											
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
		return listCart;
	}

	@Override
	public List<Cart> search(String name) {
		List<Cart> listCart = new ArrayList<Cart>();
		try {
			String sql = "SELECT cart.id, cart.priceTotal, cart.date, user.name from cart inner join user on cart.buyer = user.id where user.name LIKE ?";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, name);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				int pid = rs.getInt("id");
				String buyername = rs.getString("name");
				int priceTotal = rs.getInt("priceTotal");
				String date = rs.getString("date");
				
				Cart cart = new Cart();
				cart.setId(pid);
				cart.setPriceTotal(priceTotal);
				cart.setDate(date);
				
				User buyer = new User();
				buyer.setName(buyername);
				cart.setBuyer(buyer);
				listCart.add(cart);
											
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}
		
		return listCart;
	}
	
}
