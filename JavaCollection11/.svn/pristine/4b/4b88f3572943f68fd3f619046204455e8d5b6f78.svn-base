package com.trungtamjava.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.trungtamjava.model.Person;

public class SetExample {
	public static void main(String[] args) {
//		setExam();
//		compareObject();
		autobox();
	}
	
	public static void autobox() {
		//wrapper class
		Set<Integer> numbers = new HashSet<>();
		Set<Long> numberLongs = new HashSet<>();
		Set<Character> characters = new HashSet<>();
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		if (a == b) {
			System.out.println("bang nhau");
		}
		
		//unboxing: Integer -> int
		if (a.intValue() == b) {
			System.out.println("bang nhau");
		}
		Integer c = 10;//boxing new Integer(10);
		
		Integer.parseInt("10000");//int
		Integer.valueOf("10000");//Integer
	}
	
	public static void compareObject() {
		Person p1 = new Person();
		p1.setId(1);
		Person p2 = new Person();
		p2.setId(1);
		
		if (p1 == p2) {
			System.out.println("Trung nhau");
		}
		
		if (p1.equals(p2)) {
			System.out.println("Bang nhau");
		}
	}
	
	public static void setExam() {
		Set<Person> persons = new HashSet<Person>();
		Set<Person> persons2 = new TreeSet<Person>();
		///
		Person p1 = new Person();
		p1.setName("CUONG");
		p1.setId(1);
		Person p2 = new Person();
		p2.setName("Tuan");
		p2.setId(2);
		//them
		persons.add(p1);
		persons.add(p1);
		persons.add(p1);
		persons.add(p2);
		
		System.out.println("Size: " + persons.size());
		for (Person p : persons) {
			System.out.println(p.getName());
		}
		
		///
		persons.remove(p2);
		
		Iterator<Person> itr = persons.iterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			if (p.getName().equals("cuong")) {
				itr.remove();
			}
		}
		
	}
}
