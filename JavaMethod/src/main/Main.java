package main;

import hinhhoc.HinhChuNhat;
import hinhhoc.HinhTamGiacVuong;
import hinhhoc.HinhTron;
import hinhhoc.HinhVuong;

public class Main {
	public static void main(String[] args) {

		hinhTron();// goi ham hinh tron
		hinhVuong();// goi ham hinh vuong
		hinhtamgiac();// goi ham hinh tam giac vuong
		hinhchunhat();// goi ham hinh chu nhat

	}

	public static void hinhTron() {
		int r = 4;// ban kinh
		// chu vi hinh tron
		String s1 = "CV Hinh tron bk r = " + r;

		double cv = HinhTron.chuViHT(r);
		String s2 = " la " + cv;

		String s = s1 + s2;
		System.out.println(s);

		// dien tich hinh tron
		double dt = HinhTron.dienTichHT(r);
		String a = "DT Hinh tron bk r = " + 4 + " la " + dt;
		System.out.println(a);
	}

	public static void hinhVuong() {
		int a = 20;
		// chu vi hinh vuong
		int chuViHV = HinhVuong.chuVi(a);
		System.out.println("CV HINH VUONG :" + chuViHV);
		// dien tich hinh vuong
		int dientichHV = HinhVuong.dienTich(a);
		System.out.println("DT HINH VUONG :" + dientichHV);

	}

	public static void hinhtamgiac() {
		// chu vi hinh tam giac

		int tong3Canh = HinhTamGiacVuong.chuiViTamGiac(1, 2, 3);
		String s7 = "Chu Vi Tam Giac Vuong la : " + tong3Canh;
		System.out.println(s7);
		// dientichtamgiac
		double dttamgiacvuong = HinhTamGiacVuong.dienTichTamGiac();
		String s6 = "Dien Tich Tam Giac Vuong la : " + dttamgiacvuong;
		System.out.println(s6);
	}

	public static void hinhchunhat() {
		// chu vi hinh chu nhat
		int tong2Canh = HinhChuNhat.chuViHcn(7, 8);
		String s8 = "Chu Vi Hinh Chu Nhat la : " + tong2Canh;
		System.out.println(s8);
		// dien tich hinh chu nhat
		int tich2Canh = HinhChuNhat.dienTichHcn(4, 5);
		String s9 = "Dien Tich Hinh Chu Nhat la : " + tich2Canh;
		System.out.println(s9);
	}

}
