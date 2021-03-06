package Main;

import java.util.List;
import java.util.Scanner;
import Model.Animal;
import Service.AnimalService;
import Service.AnimalServiceImpl;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalService animalService = new AnimalServiceImpl();

		Animal husky = new Animal();
		Animal tiger = new Animal();
		Animal snake = new Animal();
		Animal fox = new Animal();

		animalService.input(husky);
		animalService.input(tiger);
		animalService.input(snake);
		animalService.input(fox);

		animalService.add(husky);
		animalService.add(tiger);
		animalService.add(snake);
		animalService.add(fox);

		// Tìm kiếm
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap  ID can tim: ");
		int id = sc.nextInt();

		Animal a = animalService.get(id);

		if (a == null) {
			System.out.println("Khong tim thay");
		} else {
			animalService.info(a);
		}

//	sc = new Scanner(System.in);
//	System.out.println("Nhập name cần add :");
//	animal.getName(sc.nextLine());
//		
//		animalService.add();

		// Xóa
		sc = new Scanner(System.in);
		System.out.println("Nhap  ID can xoa: ");
		int idXoa = sc.nextInt();

		animalService.delete(idXoa);

		///// IN lại danh sách

		System.out.println("SAU KHI XOA");
		List<Animal> aList = animalService.getList();
		for (Animal animal : aList) {
			animalService.info(animal);
		}
		
		}

	}

