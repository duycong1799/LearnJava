package com.tuhoc.dao;

import java.util.List;

import com.tuhoc.model.Person;

public interface PersonDao {
	void create(Person p);
	void update(Person p);
	void delete(Person p);
	Person get(int id);
	List<Person> search(String name);
	List<Person> searchAge(int age);
	List<Person> searchAddress(String address);	
	List<Person> searchSSN(String SSN); 
}
