package com.trungtamjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.trungtamjava.model.Person;

public class PersonServiceImpl implements PersonService {
	private List<Person> personList = new ArrayList<>();
	
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
		personList.add(person);
	}

	@Override
	public void delete(int id) {
		for (Person person : personList) {
			if (person.getId() == id) {
				personList.remove(person);
				break;//
			}
		}
	}

	@Override
	public Person get(int id) {
		for (Person person : personList) {
			if (person.getId() == id) {
				return person;
			}
		}
		
		return null;
	}

	@Override
	public List<Person> getList() {
		return personList;
	}
}
