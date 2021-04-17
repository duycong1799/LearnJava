package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Animal;

public class AnimalServiceImpl implements AnimalService {
	private List<Animal> animalList = new ArrayList<>();

	@Override
	public void input(Animal animal) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID :");
		animal.setId(sc.nextInt());

		sc = new Scanner(System.in);
		System.out.println("Nhập name :");
		animal.setName(sc.nextLine());
	}

	@Override
	public void info(Animal animal) {
		// TODO Auto-generated method stub
		System.out.println("ID là :" + animal.getId());
		System.out.println("Name là :" + animal.getName());
	}

	@Override
	public void add(Animal animal) {
		// TODO Auto-generated method stub
		animalList.add(animal);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		for (Animal animal : animalList) {
			if (animal.getId() == id) {
				animalList.remove(animal);
				break;//
			}
		}
	}

	@Override
	public Animal get(int id) {
		// TODO Auto-generated method stub
		for (Animal animal : animalList) {
			if (animal.getId() == id) {
				return animal;
			}
		}
		return null;
	}
	
	

	@Override
	public List<Animal> getList() {
		// TODO Auto-generated method stub
		return animalList;
	}

}
