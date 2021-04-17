package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import product.Product;

public class ProductDaoImpl extends JDBCConnection implements ProductDao{

	@Override
	public void add(Product product) {
		Connection conn = super.getConnection();
		try {

			String sql = "insert into product (name , price , quality) value ( ? , ? , ?);";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
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
		Connection conn = super.getConnection();
		try {

			String sql = "update product set name = ? , price = ? ,quality = ? where id = ?;";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3 , product.getQuantity());
			preparedStatement.setInt(4, product.getId());
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
		Connection conn = super.getConnection();
		try {

			String sql = "delete from product where id = ?;";

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
		Connection conn = super.getConnection();
		try {

			String sql = "SELECT * from product where id =?;";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			// doc ket qua tra ve
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
		List<Product> products = new ArrayList<>();

		Connection conn = super.getConnection();
		try {

			String sql = "SELECT * FROM product where name like ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, "%" + name + "%");
			// doc ket qua tra ve
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id "));
				product.setName(rs.getString("name "));
				product.setPrice(rs.getInt("price "));
				product.setQuantity(rs.getInt("quality "));
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
