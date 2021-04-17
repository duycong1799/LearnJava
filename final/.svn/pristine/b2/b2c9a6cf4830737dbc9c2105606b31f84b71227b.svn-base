package com.trungtamjava.main;

import java.util.List;
import java.util.Scanner;

import com.trungtamjava.dao.ProductDao;
import com.trungtamjava.dao.ProductDaoImpl;
import com.trungtamjava.dao.ProductOrderDao;
import com.trungtamjava.dao.ProductOrderDaoImpl;
import com.trungtamjava.model.Product;
import com.trungtamjava.model.ProductOrder;

public class MainProductOrder {
	public static void menu() {
		while (true) {
			System.out.println("____MENU PRODUCT ORDER___");
			System.out.println("1. Them ");
			System.out.println("2. Sua");
			System.out.println("3. Xoa");
			System.out.println("4. Tim kiem");
			System.out.println("5. Thoat");

			System.out.println("Vui long chon:");
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();

			if (select == 1) {
				addProductOrder();
			} else if (select == 2) {
				updateProductOrder();
			} else if (select == 3) {
				deleteProductOrder();
			} else if (select == 4) {
				searchProductOrder();
			} else if (select == 5) {
				break;
			}
		}
	}

	public static void addProductOrder() {
		MainProduct.searchProduct();

		ProductDao productDao = new ProductDaoImpl();

		System.out.println("Vui long nhap id san pham:");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();

		/// get food to database
		Product product = productDao.get(id);

		if (product == null) {
			System.out.println("Khong tim thay san pham");
		} else {
			ProductOrder productOrder = new ProductOrder();
			productOrder.setProduct(product);
			productOrder.setPrice(product.getPrice());

			System.out.println("Vui long nhap so luong:");
			scanner = new Scanner(System.in);
			productOrder.setQuantity(scanner.nextInt());
			
			

			/// save to database
			ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
			productOrderDao.add(productOrder);
		}

	}
	public static void updateProductOrder() {
		System.out.println("Vui long nhap id:");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();

		/// save to database
		ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
		ProductOrder productOrder = productOrderDao.get(id);

		if (productOrder == null) {
			System.out.println("Khong tim thay");
		} else {
			/// QUY TRINH NHU THEM MOI
			// show MENU Product
			MainProduct.searchProduct();

			ProductDao productDao = new ProductDaoImpl();

			System.out.println("Vui long nhap id san pham :");
			scanner = new Scanner(System.in);
			int productId = scanner.nextInt();

			/// get product to database
			Product product = productDao.get(productId);

			if (product == null) {
				System.out.println("Khong tim thay san pham");
			} else {
				// UPDATE su dung lai productorder cu, ko tao moi
				productOrder.setProduct(product);
				productOrder.setPrice(product.getPrice());

				System.out.println("Vui long nhap so luong:");
				scanner = new Scanner(System.in);
				productOrder.setQuantity(scanner.nextInt());
				// update
				productOrderDao.update(productOrder);
			}
		}
		
	}
	public static void deleteProductOrder() {
		System.out.println("Vui long nhap order id:");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();

		/// save to database
		ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
		productOrderDao.delete(id);
		
	}
	public static void searchProductOrder() {
		System.out.println("Vui long nhap ten san pham can tim:");
		Scanner scanner = new Scanner(System.in);
		String keyword = scanner.nextLine();

		/// save to database
		ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
		List<ProductOrder> productOrders = productOrderDao.search(keyword);
		System.out.println("ID | Product Name|Price | SL | Total");
		System.out.println("------------------------------");

		for (ProductOrder productOrder : productOrders) {
			System.out.println(productOrder.getId() + "  " + productOrder.getProduct().getName() + "  " + productOrder.getPrice()
					+ "  " + productOrder.getQuantity() + "  " + (productOrder.getQuantity() * productOrder.getPrice()));

			System.out.println("------------------------------");
		}
		
	}
}
