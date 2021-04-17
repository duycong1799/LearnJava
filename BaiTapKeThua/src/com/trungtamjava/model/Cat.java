package com.trungtamjava.model;

import java.util.Scanner;

public class Cat extends Animal {
	private String maulong;

	public String getMaulong() {
		return maulong;
	}

	public void setMaulong(String maulong) {
		this.maulong = maulong;
	}

	@Override
	public void info() {
		super.info();
		
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập màu lông của Cat :");
		this.setMaulong(sc.nextLine());

	}
}
