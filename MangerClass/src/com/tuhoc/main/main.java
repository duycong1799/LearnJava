package com.tuhoc.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tuhoc.dao.PersonDao;
import com.tuhoc.dao.PersonDaoImpl;
import com.tuhoc.model.Person;

public class main {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("========MENU=======");
		System.out.println("1.Them Sinh Vien ");
		System.out.println("2.Sua thong tin sinh vien ");
		System.out.println("3.Xoa Sinh Vien ");
		System.out.println("4.Tim kiem theo ten sinh vien ");
		System.out.println("5.Tim kiem theo tuoi sinh vien");
		System.out.println("6.Tim kiem theo dia chi sinh vien");
		System.out.println("7.Tim kiem theo ma sinh vien");
		System.out.println("Vui long nhap lua chon : ");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		switch (select) {
		case 1:
			create();
			menu();
			break;
		case 2:
			update();
			menu();
			break;
		case 3:
			delete();
			menu();
			break;
		case 4:
			searchName();
			menu();
			break;
		case 5:
			searchAge();
		case 6:
			searchAddress();
			menu();
			break;
		case 7:
			searchSSN();
			menu();
			break;
		default:
			throw new IllegalArgumentException("Nhap tu 1 den 4 " + select);
		}

	}

	public static void create() {
		Person person = new Person();

		input(person);
		PersonDao personDao = new PersonDaoImpl();
		personDao.create(person);
		System.out.println("Da Them Thanh Cong!");
		info(person);
	}

	public static void update() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id can sua : ");
		int id = sc.nextInt();
		person.setId(id);
		input(person);
		PersonDao personDao = new PersonDaoImpl();
		personDao.update(person);
		System.out.println("Da upadte thanh cong!");
		info(person);
	}

	public static void delete() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id can xoa : ");
		int id = sc.nextInt();
		person.setId(id);

		PersonDao personDao = new PersonDaoImpl();
		personDao.delete(person);
		System.out.println("Da xoa thanh cong!");

	}

	public static void searchName() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien tim kiem : ");
		String name = sc.nextLine();
		person.setName(name);

		PersonDao personDao = new PersonDaoImpl();
		List<Person> ps = personDao.search(name);

		// dieu kien tim
		if (ps.isEmpty()) {
			System.out.println("Khong tim thay sinh vien");
		} else {
			for (Person pt : ps) {
				info(pt);
				System.out.println("---------------");
			}
		}
		System.out.println("Tim kiem Thanh Cong!");

	}

	public static void searchAge() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap tuoi sinh vien can tim kiem : ");
		int age = sc.nextInt();
		person.setAge(age);

		PersonDao personDao = new PersonDaoImpl();
		List<Person> ps = personDao.searchAge(age);
		// dieu kien tim thay
		if (ps.isEmpty()) {
			System.out.println("Tuoi cua sinh vien khong ton tai!");
		} else {
			for (Person pt : ps) {
				info(pt);
				System.out.println("Tim Kiem Thanh Cong!");
			}
		}
	}

	public static void searchAddress() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap dia can tim kiem : ");
		String address = sc.nextLine();
		person.setAddress(address);

		PersonDao personDao = new PersonDaoImpl();
		List<Person> ps = personDao.searchAddress(address);
		if (ps.isEmpty()) {
			System.out.println("Khong tim thay ket qua!");
		} else {
			for (Person ptc : ps) {
				info(ptc);
				System.out.println("Tim kiem thanh cong!");
			}
		}

	}

	public static void searchSSN() {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap SSN sinh vien : ");
		String SSN = sc.nextLine();
		person.setSSN(SSN);

		PersonDao personDao = new PersonDaoImpl();
		List<Person> ps = personDao.searchSSN(SSN);
		if (ps.isEmpty()) {
			System.out.println("Khong tim thay ket qua!");
		} else {
			for (Person ptc : ps) {
				info(ptc);
				System.out.println("Tim Kiem Thanh Cong!");
			}
		}

	}

	public static void input(Person p) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien : ");
		p.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Nhap tuoi sinh vien : ");
		p.setAge(sc2.nextInt());

		Scanner sc3 = new Scanner(System.in);
		System.out.print("Nhap dia chi sinh vien : ");
		p.setAddress(sc3.nextLine());

		Scanner sc4 = new Scanner(System.in);
		System.out.print("Nhap SSN : ");
		p.setSSN(sc4.nextLine());
	}

	public static void info(Person p) {
		System.out.println("===============");
		System.out.println("Ten Sinh Vien : " + p.getName());
		System.out.println("Tuoi cua Sinh Vien : " + p.getAge());
		System.out.println("Dia Chi cua Sinh Vien : " + p.getAddress());
		System.out.println("SSN cua Sinh Vien : " + p.getSSN());
	}
}
