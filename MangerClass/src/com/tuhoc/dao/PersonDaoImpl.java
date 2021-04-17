package com.tuhoc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tuhoc.JDBDConnection.JDBCConnection;
import com.tuhoc.model.Person;

public class PersonDaoImpl extends JDBCConnection implements PersonDao {

	@Override
	public void create(Person person) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO user(name, age, address,SSN) VALUES(?, ?, ?, ?);";
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			// set gia tri vao doi tuong statement
			statement.setString(1, person.getName());
			statement.setInt(2, person.getAge());
			statement.setString(3, person.getAddress());
			statement.setString(4, person.getSSN());
			// gui cau lenh di bang ham excuteUpdate
			statement.executeUpdate();
			/// lay id ve tu gennerated set vao p
			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				int id = rs.getInt(1);// id dc gen o db
				// set vao doi tuong de su dung trong class khac
				person.setId(id);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}

	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE user SET name = ?, age = ?, address = ?, SSN = ? WHERE id = ?";
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);

			// set gia tri vao bien statement
			statement.setString(1, person.getName());
			statement.setInt(2, person.getAge());
			statement.setString(3, person.getAddress());
			statement.setString(4, person.getSSN());
			statement.setInt(5, person.getId());
			// gui cau lenh di bang ham executeUpdate
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE FROM user WHERE id = ?;";
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);

			// nhap id can xoa
			statement.setInt(1, p.getId());
			// gui cau lenh bang ham executeUpdate

			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}

	}

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "SELECT * FROM user WHERE id = ?;";
			// setup cau lenh
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);

			statement.setInt(1, id);

			/// GUI CAU LENH DI
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {// lap tung dong
				/// get theo du lieu + ten cot sql ben trong
				Person person = laydulieu(rs);
				return person;// tra ve doi tuong tim thay dau tien
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		return null;
	}

	@Override
	public List<Person> search(String name) {
		// TODO Auto-generated method stub
		List<Person> ps = new ArrayList<Person>();
		
		try {
			String sql = "SELECT * FROM user WHERE name LIKE ?";
			//"SELECT * FROM car WHERE name LIKE ?;";
			//setup cau lenh
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);
			//
			statement.setString(1, name);
			//gui cau lenh di 
			ResultSet rs =  statement.executeQuery();
			while(rs.next()) {
				Person ps2 = laydulieu(rs);
				ps.add(ps2);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		return ps;
	}
	
	@Override
	public List<Person> searchAge(int age) {
		// TODO Auto-generated method stub
		List<Person> ps = new ArrayList<Person>();
		
		try {
			//setup cau lenh 
			String sql = "SELECT * FROM user WHERE age LIKE ?";
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);
			//set gia tri 
			statement.setInt(1, age);
			//gui cau lenh di
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {//lap lai tung dong
				Person person = laydulieu(rs);
				ps.add(person);//chen vao list
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		return ps;
	}
	
	@Override
	public List<Person> searchAddress(String address) {
		// TODO Auto-generated method stub
		List<Person> ps2 = new ArrayList<Person>();
		
		try {
			String sql = "SELECT * FROM user WHERE address = ?";
			//setup cau lenh
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);
			//set gia tri cho statement 
			statement.setString(1, address);
			//gui cau lenh bang ham query
			ResultSet rs = statement.executeQuery();
			//them vao List 
			while(rs.next()) {//lap 
				Person person = laydulieu(rs);
				ps2.add(person);//them vao list 
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : "+ e);
		}
		
		return ps2;
	}
	
	@Override
	public List<Person> searchSSN(String SSN) {
		// TODO Auto-generated method stub
		List<Person> ps2 = new ArrayList<Person>();
		try {
			String sql = "SELECT * FROM user WHERE SSN = ?";
			//setup cau lenh 
			Connection coon = super.getConnection();
			PreparedStatement statement = coon.prepareStatement(sql);
			//set gia tri vao statement
			statement.setString(1, SSN);
			//gui cau lenh di bang ham Query
			ResultSet rs = statement.executeQuery();
			//chen du lieu vao list
			while(rs.next()) {//lap lai
				Person person = laydulieu(rs);
				ps2.add(person);//them vao list bang ham add
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi : " + e);
		}
		
		
		return ps2;
	}


	private Person laydulieu(ResultSet rs) throws Exception {
		// lay du lieu theo tung cot
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int age = rs.getInt("age");
		String address = rs.getString("address");
		String SSN = rs.getString("SSN");

		// set gia tri vao doi tuong
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAge(age);
		person.setAddress(address);
		person.setSSN(SSN);

		return person;
	}




	
}
