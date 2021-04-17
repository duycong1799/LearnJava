package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// b1();
		// b2();
		sapxep();
	}

//	public static void b1() {
//		int count = 0;
//		System.out.println("So chan la :");
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//
//		}
//		System.out.println("Co tat ca " + count + "so chan");
//
//	}

//	public static void b2() {
//		int n;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap mang : ");
//		n = sc.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			System.out.println("Nhap phan tu vao mang :");
//			a[i] = sc.nextInt();
//		}
//		// hienthi
//		for (int i = 0; i < n; i++) {
//			System.out.println("Mang vua nhap : " + a[i]);
//		}
//	}
	static List<Integer> ran_num;
	public static void sapxep() {

		int arr[] = new int[1001];
		Random rd = new Random();
		for(int i=0; i < arr.length; i++ ) {
			arr[i] = rd.nextInt(1000);
		}
		Collections.shuffle(Arrays.asList(arr));
		ran_num=new ArrayList<Integer>();
		for(int i=0; i < arr.length; i++ ) {
			for(int j=i+1;j < arr.length;j++) {
				int temp = arr[0];
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
					
			}
		}
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
