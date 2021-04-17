package BaiTapVeNhaLan4;

import java.util.Scanner;

public class BaoVe {
	public String name;
	public int age;
	public String adress;
	private long luong;

	public BaoVe(String name, int age, String adress, long luong) {
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.luong = luong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Tên : " + name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = "Adress : " + adress;
	}

	public long getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

}
