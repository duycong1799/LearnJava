package BaiTapVeNhaLan2;

import java.util.Scanner;

public class BaiTapVeNhaLan2 {


	public static void main(String[] args) {
		sapXep();
	}

	public static void sapXep() {
		System.out.print("Nhập số phần tử của mảng : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhập giá trị cho các phần tử : ");
			
			arr[i] = sc.nextInt();

		}
		System.out.print("Sắp xếp các phần tử theo thứ tự tăng dần là :");
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			for (int j = i + 1; i < arr.length; j++) {
				if (temp > arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
					temp = arr[i];
				}

			}

			System.out.println("Mảng được sắp xếp tăng dần: ");
			for (int x : arr) {
				System.out.println(x);

			}

		}

	}
}

