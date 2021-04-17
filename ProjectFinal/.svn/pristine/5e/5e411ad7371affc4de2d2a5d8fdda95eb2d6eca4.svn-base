package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import product.Product;
import product.ProductOrder;

public class ProductOrderDaoImpl extends JDBCConnection implements ProductOrderDao{

	@Override
	public void add(ProductOrder productOrder) {
		Connection conn = super.getConnection();
		try {

			String sql = "insert into productorder "
					+ "(quality , price, product_id) value ( ? , ?, ?);";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, productOrder.getQuantity());
			preparedStatement.setInt(2, productOrder.getPrice());
			preparedStatement.setInt(3, productOrder.getProduct().getId());
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
	public void update(ProductOrder productOrder) {
		Connection conn = super.getConnection();
		try {

			String sql = "update productorder "
					+ "set quality = ? , price = ?, product_id = ? where id = ?;";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, productOrder.getQuantity());
			preparedStatement.setInt(2, productOrder.getPrice());
			preparedStatement.setInt(3, productOrder.getProduct().getId());
			preparedStatement.setInt(4, productOrder.getId());

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
			String sql = "delete from productorder where id = ?;";
			
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
	public ProductOrder get(int id) {
		Connection conn = super.getConnection();
		try {

			String sql = "select po.id as 'order_id' "
					+ ", po.quality , po.price , "
					+ "po.product_id , p.name"
					+ " from productorder po inner join product p "
					+ " on po.product_id = p.id where po.id = ?;";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			// doc ket qua tra ve
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ProductOrder productOrder = new ProductOrder();
				productOrder.setId(rs.getInt("order_id"));
				productOrder.setQuantity(rs.getInt("quality"));
				productOrder.setPrice(rs.getInt("price"));

				Product product = new Product();
				product.setId(rs.getInt("product_id"));
				product.setName(rs.getString("name"));
				
				productOrder.setProduct(product);
				
				return productOrder;
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
	public List<ProductOrder> search(String productName) {
		List<ProductOrder> productOrders = new ArrayList<>();

		Connection conn = super.getConnection();
		try {
			String sql = "select po.id as 'order_id' "
					+ ", po.quality , po.price ,po.product_id "
					+ ", p.name"
					+ " from productorder po inner join product p "
					+ " on po.product_id = p.id"
					+ " where p.name like ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, "%" + productName + "%");
			// doc ket qua tra ve
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				ProductOrder productOrder = new ProductOrder();
				productOrder.setId(rs.getInt("id"));
				productOrder.setQuantity(rs.getInt("quality"));
				productOrder.setPrice(rs.getInt("price"));
				
				Product product = new Product();
				product.setId(rs.getInt("product_id"));
				product.setName(rs.getString("name"));
				productOrder.setProduct(product);
				
				productOrders.add(productOrder);
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

		return productOrders;
	}

}
	