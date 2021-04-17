package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Cat;
import com.trungtamjava.model.Dog;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dongVat();
		testCat();
		testDog();

	}

	public static void dongVat() {
		//Cat
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập số lượng mèo :");
		int x = sc.nextInt();

		Cat[] cats = new Cat[x];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[i].input();

		}
		System.out.println("Thông tin Cat :");
		for (Cat meo : cats) {
			meo.info();

		}
		for (int i = 0; i < cats.length; i++) {
			cats[i].info();
		}
		
		//Dog
		sc = new Scanner(System.in);
		System.out.print("Vui lòng nhập số lượng chó :");
		int y = sc.nextInt();

		Dog[] dogs = new Dog[y];
		for (int i = 0; i < cats.length; i++) {
			dogs[i] = new Dog();
			dogs[i].input();

		}
		System.out.println("Thông tin Dog :");
		for (Dog cho : dogs) {
			cho.info();

		}
		for (int i = 0; i < cats.length; i++) {
			dogs[i].info();
		}

	}

	public static void testCat() {
		Cat meos = new Cat();
		meos.info();
		meos.input();

	}

	public static void testDog() {
		Dog chos = new Dog();
		chos.info();
		chos.input();
	}

}
