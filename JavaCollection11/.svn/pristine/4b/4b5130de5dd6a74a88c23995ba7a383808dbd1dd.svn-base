package com.trungtamjava.main;

import java.util.List;
import java.util.Scanner;

import com.trungtamjava.model.Person;
import com.trungtamjava.service.PersonMapServiceImpl;
import com.trungtamjava.service.PersonService;
import com.trungtamjava.service.PersonServiceImpl;

public class MainPerson {
	public static void main(String[] args) {
		PersonService personService = new PersonMapServiceImpl();

		Person java = new Person();
		Person sql = new Person();
		Person html = new Person();

		personService.input(java);
		personService.input(sql);
		personService.input(html);

		personService.add(java);
		personService.add(sql);
		personService.add(sql);

		/// TIM
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap  ID can tim: ");
		int id = sc.nextInt();

		Person p = personService.get(id);

		if (p == null) {
			System.out.println("Khong tim thay");
		} else {
			personService.info(p);
		}
		/// XOA
		sc = new Scanner(System.in);
		System.out.println("Nhap  ID can xoa: ");
		int idXoa = sc.nextInt();
		
		personService.delete(idXoa);
		
		//////
		System.out.println("SAU KHI XOA");
		List<Person> pList = personService.getList();
		for (Person person : pList) {
			personService.info(person);
		}
	}
}
