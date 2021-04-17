package com.trungtamjava.main;

import java.util.List;
import java.util.Scanner;
import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.model.Product;

public class MainProduct {
	public static void menu() {
		while (true) {

			System.out.println("----Menu Product----");
			System.out.println("1.Thêm");
			System.out.println("2.Sửa");
			System.out.println("3.Xóa");
			System.out.println("4.Tìm Kiếm");
			System.out.println("5.Thoát");
			System.out.println("Nhấp vào lựa chọn :");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if (select == 1) {
				addProduct();

			} else if (select == 2) {
				updateProduct();

			} else if (select == 3) {
				deleteProduct();

			} else if (select == 4) {
				searchProduct();

			} else if (select == 5) {
				break;
			} else {
				System.out.println("Vui long nhap lai!");
			}

		}
	}

	public static void addProduct() {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên cần thêm :");
		product.setName(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("Nhập giá :");
		product.setPrice(sc.nextInt());

		ProductDao productDao = new ProductDaoImpl();
		productDao.add(product);

	}

	public static void updateProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID can update :");
		int id = sc.nextInt();

		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(id);
		if (product == null) {
			System.out.println("khong tim thay");
		} else {
			System.out.println("Sản phẩm sẽ được cập nhật là:");
			info(product);
			// cho cap nhat thong tin moi
			sc = new Scanner(System.in);
			System.out.println("Nhap ten :");
			product.setName(sc.nextLine());

			sc = new Scanner(System.in);
			System.out.println("Nhap gia moi:");
			product.setPrice(sc.nextInt());
			// capnhat database
			productDao.update(product);

		}

	}

	public static void deleteProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id cần xóa :");
		int id = sc.nextInt();

		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.get(id);
		if (product == null) {
			System.out.println("khong tim thay");
		} else {
			System.out.println("Product se bi xoa la:");
			info(product);
			productDao.delete(id);
		}

	}

	public static void searchProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten mat hang can tim");
		String name = sc.nextLine();

		ProductDao productDao = new ProductDaoImpl();
		List<Product> products = productDao.search(name);
		if (products.isEmpty()) {
			System.out.println("khong tim thay");
		} else {
			for (Product product : products) {
				info(product);

			}
		}

	}

	public static void info(Product product) {
		System.out.println(
				"Product: id=" + product.getId() + "name=" + product.getName() + "price=" + product.getPrice());
	}

}
