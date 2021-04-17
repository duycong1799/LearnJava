package com.trungtamjava.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.trungtamjava.model.Person;

public class ListExample {
	public static void main(String[] args) {
		List<Person> personList1 = new ArrayList<>();
		List<Person> personList2 = new Vector<>();
		////CAC HAM CUA LIST
		Person khanh = new Person();
		khanh.setName("khanh");
		khanh.setId(1);
		Person khai = new Person();
		khai.setName("khai");
		khai.setId(2);
		Person lam = new Person();
		lam.setName("lam");
		lam.setId(3);
		
		////Them 3 thang vao list
		personList1.add(khanh);//0
		personList1.add(khai);//1
		personList1.add(lam);//2
		personList1.add(lam);//3
		personList1.add(lam);//4
		personList1.add(khai);//5
		//personList1.add(0,khai);//5
		
		System.out.println(personList1.get(1).getName());
		//
		for (int i = 0; i < personList1.size();i++) {
			System.out.println(personList1.get(i).getName());
		}
		System.out.println("______FOR EACH______");
		for (Person person : personList1) {
			System.out.println(person.getName());
		}
		///xoa
		personList1.remove(5);
		System.out.println("______FOR EACH______");
		for (Person person : personList1) {
			System.out.println(person.getName());
		}
		personList1.remove(lam);
		System.out.println("______FOR EACH______");
		for (Person person : personList1) {
			System.out.println(person.getName());
		}
		///xoa theo ten
		for (Person person : personList1) {
			if (person.getName().equals("lam")) {
				personList1.remove(person);
				break;//
			}
		}
		/////Iterator
		Iterator<Person> itr = personList1.iterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			if (p.getName().equals("lam")) {
				itr.remove();
			}
		}
		
		System.out.println("______FOR EACH______");
		for (Person person : personList1) {
			System.out.println(person.getName());
		}
	}
}
