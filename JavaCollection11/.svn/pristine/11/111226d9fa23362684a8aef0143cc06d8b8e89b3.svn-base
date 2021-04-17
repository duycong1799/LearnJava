package com.trungtamjava.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.trungtamjava.model.Person;

public class MapExample {
	public static void main(String[] args) {
		mapExam();
	}
	
	public static void mapExam() {
		Map<String, Person> personMap
			= new HashMap<>();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("P1");
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("P2");
		
		personMap.put("p1", p1);
		personMap.put("person2", p2);
		personMap.put("p1", p1);
		
		System.out.println("Size: " + personMap.size());
		
		Person p = personMap.get("p1");//p1
		System.out.println(p.getName());
		
		Set<String> keys = personMap.keySet();
		for (String key: keys) {
			Person person = personMap.get(key);
			System.out.println(person.getName());
		}
		
		for (Entry<String, Person> entry: personMap.entrySet()) {
			System.out.println(entry.getKey());
			
			Person person = entry.getValue();
			System.out.println(person.getName());
		}
		
		personMap.remove("p");
		
	}
}
