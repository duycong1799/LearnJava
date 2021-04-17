package com.trungtamjava.model;

import java.util.Scanner;

public class Dog extends Animal{
	private String thucan;

	public String getThucan() {
		return thucan;
	}

	public void setThucan(String thucan) {
		this.thucan = thucan;
	}
	
	 @Override
	 public void info() {
		 super.info();
		 System.out.print("Thuc an cua Dog : " + this.thucan);
	 }
	 @Override
	 public void input() {
		 super.input();
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Vui lòng chọn thức ăn cho Dog :");
		 this.setThucan(sc.nextLine());
	 }

}
