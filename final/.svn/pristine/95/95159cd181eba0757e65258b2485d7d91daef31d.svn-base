package com.trungtamjava.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		while (true) {
			System.out.println("------MENU------");
			System.out.println("1.QL PRODUCT");
			System.out.println("2.QL PRODUCT ORDER");
			System.out.println("3.THOÁT");
			System.out.println("Nhập vào lựa chọn :");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if (select == 1) {
				MainProduct.menu();

			} else if (select == 2) {
				MainProductOrder.menu();
			}  else if (select == 3) {
				break;
			} else {
				System.out.println("Vui long nhap lai!");

			}

		}
	}
}