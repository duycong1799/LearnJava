package Model;

import java.util.Scanner;

public class Person {
	private String name;
	private String sex;
	private int age;
	private DiaChi hometown;
	private DiaChi tamTru;
	
	

	public DiaChi getHometown() {
		return hometown;
	}

	public void setHometown(DiaChi hometown) {
		this.hometown = hometown;
	}

	public DiaChi getTamTru() {
		return tamTru;
	}

	public void setTamTru(DiaChi tamTru) {
		this.tamTru = tamTru;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten: ");
		setName(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("Nhap vao gioi tinh: ");
		setSex(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("Nhap vao so tuoi: ");
		setAge(sc.nextInt());
	}

	public void info() {
		System.out.println("Ten : " + getName());
		System.out.println("Gioi tinh :" + getSex());
		System.out.println("Tuoi : " + getAge());

	}
}
