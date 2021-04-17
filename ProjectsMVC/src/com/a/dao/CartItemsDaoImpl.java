package com.a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.a.jdbcConnection.jdbcConnection;
import com.a.model.CartItems;
import com.a.model.Category;
import com.a.model.Product;

public class CartItemsDaoImpl extends jdbcConnection implements CartItemsDao{

	@Override
	public void create(CartItems cartItems) {
		String sql = "insert into cartitems(product_id,cart_id,quantity,unitPrice) values(?,?,?,?)";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, cartItems.getProduct().getId());
			preparedStatement.setInt(2, cartItems.getCart().getId());
			preparedStatement.setInt(3, cartItems.getQuantity());
			preparedStatement.setLong(4, cartItems.getUnitPrice());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(CartItems cartItems) {
		String sql = "UPDATE cartitems SET product_id=?,cart_id=?, quantity=?, unitPrice=?   WHERE id=?";
		Connection conn = super.getJDBCConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, cartItems.getProduct().getId());
			preparedStatement.setInt(2, cartItems.getCart().getId());
			preparedStatement.setInt(3, cartItems.getQuantity());
			preparedStatement.setLong(4, cartItems.getUnitPrice());
			preparedStatement.setInt(5, cartItems.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM cartitems WHERE id = ?;";

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
	public CartItems get(int id) {
		try {
			// lay tat ca cua cot cartItems va mot so cot cua product
			String sql = "SELECT ci.*, product.name, product.description, product.id as 'p_id' from cartitems ci inner join product on ci.product_id = product.id  WHERE ci.id = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				CartItems cartItems = new CartItems();
				cartItems.setId(rs.getInt("id"));
				cartItems.setQuantity(rs.getInt("quantity"));
				cartItems.setUnitPrice(rs.getLong("unitPrice"));
				
				Product product = new Product();
				product.setName(rs.getString("name"));
				product.setId(rs.getInt("p_id"));
				product.setDescription("description");
				
				cartItems.setProduct(product);
				return cartItems;
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return null;
	}

	@Override
	public List<CartItems> search(int cartId) {
		List<CartItems> listcartItems = new ArrayList<CartItems>();
		
		try {
			// lay tat ca cua cot cartItems va mot so cot cua product
			String sql = "SELECT ci.*, product.name, product.description, product.id as 'p_id' from cartitems ci inner join product on ci.product_id = product.id  WHERE ci.cart_id = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, cartId);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				CartItems cartItems = new CartItems();
				cartItems.setId(rs.getInt("id"));
				cartItems.setQuantity(rs.getInt("quantity"));
				cartItems.setUnitPrice(rs.getLong("unitPrice"));
				
				Product product = new Product();
				product.setName(rs.getString("name"));
				product.setId(rs.getInt("p_id"));
				product.setDescription(rs.getString("description"));
				
				cartItems.setProduct(product);	
				listcartItems.add(cartItems);
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return listcartItems;
	}

	@Override
	public List<CartItems> search(String name) {
List<CartItems> listcartItems = new ArrayList<CartItems>();
		
		try {
			// lay tat ca cua cot cartItems va mot so cot cua product
			String sql = "SELECT ci.*, product.name, product.description, product.id as 'p_id' from cartitems ci inner join product on ci.product_id = product.id  WHERE product.name = ?;";

			/// Setup cau lenh
			Connection conn = super.getJDBCConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, name);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				CartItems cartItems = new CartItems();
				cartItems.setId(rs.getInt("id"));
				cartItems.setQuantity(rs.getInt("quantity"));
				cartItems.setUnitPrice(rs.getLong("unitPrice"));
				
				Product product = new Product();
				product.setName(rs.getString("name"));
				product.setId(rs.getInt("p_id"));
				product.setDescription(rs.getString("description"));
				
				cartItems.setProduct(product);	
				listcartItems.add(cartItems);
			}

		} catch (Exception e) {
			System.out.println("Loi " + e);
		}

		return listcartItems;
	}
	
}
