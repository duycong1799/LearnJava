package com.tuhoc.model;

public class Person {
	private int id;
	private String name;
	private int age;
	private String address;
	private String SSN;

//	public Person(String tname, int iage, String raddress, String SSN) {
//		this.name = tname;
//		this.age = iage;
//		this.address = raddress;
//		this.SSN = SSN;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

}
