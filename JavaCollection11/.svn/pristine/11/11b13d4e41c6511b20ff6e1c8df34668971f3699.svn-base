package com.trungtamjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.trungtamjava.model.Person;

public class PersonMapServiceImpl implements PersonService {
	private Map<Integer, Person> personMap = new TreeMap<>();
	
	@Override
	public void input(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ID");
		person.setId(sc.nextInt());
		
		sc = new Scanner(System.in);
		System.out.println("Nhap vao Name");
		person.setName(sc.nextLine());
	}

	@Override
	public void info(Person person) {
		System.out.println("ID: " + person.getId());
		System.out.println("Name: " + person.getName());
	}

	@Override
	public void add(Person person) {
		personMap.put(person.getId(), person);
	}

	@Override
	public void delete(int id) {
		personMap.remove(id);
	}

	@Override
	public Person get(int id) {
		return personMap.get(id);
	}

	@Override
	public List<Person> getList() {
		List<Person> persons = new ArrayList<>();
		///convert map sang list
		for (Entry<Integer, Person> entry: personMap.entrySet()) {
			Person person = entry.getValue();
			persons.add(person);
		}
		
		return persons;
	}
}
