package com.trungtamjava.model;

import java.util.Scanner;

public class Animal {
	//private String species;
	private String name;
	private int age;

	public void info() {
		
		System.out.print("Name : " + this.getName());
		System.out.print("Age : " + this.getAge());
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		

		sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập tên :");
		this.setName(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập age : ");
		this.setAge(sc.nextInt());

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

}
