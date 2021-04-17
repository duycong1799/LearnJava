package main;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		menuProduct();
	}
	public static void menuProduct() {
		while (true) {
			System.out.println("---MENU FOOD ---");
			System.out.println("1.Quan li Product");
			System.out.println("2.Quan li User");
			System.out.println("3.Quan li ProductOrder");
			System.out.println("4.Thoat");
			System.out.println("Nhap vao lua chon");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if (select == 1) {
				MainProduct.menuProduct();
			} else if (select == 2) {

			} else if (select == 3) {
				MainProductOrder.menuProductOrder();
			} else if (select == 4) {

				break;
			} else {
				System.out.println("vui long nhap lai");
			}
		}
	}
}
