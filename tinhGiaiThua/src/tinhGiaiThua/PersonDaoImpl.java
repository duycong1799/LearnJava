package tinhGiaiThua;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PersonDaoImpl extends JDBCConnection implements PersonDao{

	@Override
	public void create(Person p) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO USER(id,name,age,address,ssn) VALUES(?,?,?,?,?)";
			Connection coon = super.getConnection();
			PreparedStatement sta = coon.prepareStatement(sql);
			
			sta.setInt(1, p.getId());
			sta.setString(2, p.getName());
			sta.setInt(3, p.getAge());
			sta.setString(4, p.getAddress());
			sta.setString(5, p.getSsn());
			sta.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		
	}

	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub
		try {
			String sql = "Update user set name=?, age=?, address=?,ssn=? where id = ?";
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);
			
			
			statement.setString(1, p.getName());
			statement.setInt(2, p.getAge());
			statement.setString(3, p.getAddress());
			statement.setString(4, p.getSsn());
			statement.setInt(5, p.getId());
			
			statement.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		
	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
