package main;

import java.util.List;
import java.util.Scanner;

import product.Product;
import impl.ProductDao;
import impl.ProductDaoImpl;

public class MainProduct {
	
	public static void menuProduct() {
		while (true) {
			System.out.println("---MENU Product ---");
			System.out.println("1.Them");
			System.out.println("2.Sua");
			System.out.println("3.Xoa");
			System.out.println("4.Tim Kiem");
			System.out.println("5.Thoat");
			System.out.println("Nhap vao lua chon");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if (select == 1) {
				add();
			} else if (select == 2) {
				updateFood();
			} else if (select == 3) {
				delete();
			} else if (select == 4) {
				searchProduct();
			} else if (select == 5) {

				break;
			} else {
				System.out.println("vui long nhap lai");
			}
		}

	}

	public static void add() {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten ");
		product.setName(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("nhap vao gia ");
		product.setPrice(sc.nextInt());

		sc = new Scanner(System.in);
		System.out.println("nhap vao so luong ");
		product.setQuantity(sc.nextInt());

		ProductDao productDao = new ProductDaoImpl();
		productDao.add(product);

	}

	public static void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao id ");
		int id = sc.nextInt();

		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(id);

		if (product == null) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("San pham se bi xoa");
			info(product);
			productDao.delete(id);
		}

	}

	public static void info(Product product) {
		System.out.println("Product : id = " + " " + product.getId() + "name = " + " " + product.getName() + "price = "
				+ " " + product.getPrice() + "quality " + " " + product.getQuantity());

	}

	public static void searchProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten ");
		String name = sc.nextLine();

		ProductDao productDao = new ProductDaoImpl();
		List<Product> products = productDao.search(name);
		if (products.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (Product product : products) {
				info(product);
			}
		}

	}
	public static void updateFood() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao id ");
		int id = sc.nextInt();

		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(id);

		if (product == null) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Product duoc cap nhat lai la");
			info(product);
			sc = new Scanner(System.in);
			System.out.println("nhap vao ten moi");
			product.setName(sc.nextLine());

			sc = new Scanner(System.in);
			System.out.println("nhap vao gia moi");
			product.setPrice(sc.nextInt());
			
			sc = new Scanner(System.in);
			System.out.println("nhap vao so luong moi");
			product.setQuantity(sc.nextInt());
			
			productDao.update(product);
			
		}

	}
}
