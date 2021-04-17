package com.trungtamjava.model;

public class Person {
	private int id;
	private String name;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.getId() == this.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
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

}
