package main;

import java.util.List;
import java.util.Scanner;

import impl.ProductDao;
import impl.ProductDaoImpl;
import impl.ProductOrderDao;
import impl.ProductOrderDaoImpl;
import product.Product;
import product.ProductOrder;

public class MainProductOrder {
	public static void menuProductOrder() {
		while (true) {
			System.out.println("---MENU ORDER ---");
			System.out.println("1.Them");
			System.out.println("2.Sua");
			System.out.println("3.Xoa");
			System.out.println("4.Tim Kiem");
			System.out.println("5.Thoat");
			System.out.println("Nhap vao lua chon");

			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			if (select == 1) {
				addProductOrder();
			} else if (select == 2) {

			} else if (select == 3) {
				deleteFoodOrder();
			} else if (select == 4) {
				searchProductOrder();
			} else if (select == 5) {
				break;
			} else {
				System.out.println("vui long nhap lai");
			}
		}
	}

	public static void updateOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao id ");
		int id = sc.nextInt();

		ProductOrderDao orderDao = new ProductOrderDaoImpl();
		ProductOrder order = orderDao.get(id);

		if (order == null) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Order duoc cap nhat lai la");
			info(order);

			ProductDao productDao = new ProductDaoImpl();
			Product product = productDao.get(order.getProduct().getId());

			while (true) {
				sc = new Scanner(System.in);
				System.out.println("nhap vao so luong moi");
				int newQuantity = sc.nextInt();
				int oldQuantity = order.getQuantity();
				
				if (oldQuantity + product.getQuantity() >= newQuantity) {
					product.setQuantity(product.getQuantity()
							+ oldQuantity - newQuantity);
					
					order.setQuantity(newQuantity);
					break;
				} else {
					System.out.println("SL trong kho khong du!");
					System.out.println("Vui long nhap SL <= " + product.getQuantity());
				}
			}
			//update order
			orderDao.update(order);
			//update product
			productDao.update(product);
		}
	}

	public static void addProductOrder() {
		MainProduct.searchProduct();

		ProductDao productDao = new ProductDaoImpl();

		System.out.println("nhap vao product id");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		Product product = productDao.get(id);

		if (product == null) {
			System.out.println("khong tim thay san pham");
		} else {
			ProductOrder productOrder = new ProductOrder();
			productOrder.setProduct(product);
			productOrder.setPrice(product.getPrice());
			while (true) {
				System.out.println("Vui long nhap so luong");
				sc = new Scanner(System.in);
				productOrder.setQuantity(sc.nextInt());
				if (productOrder.getQuantity() <= product.getQuantity()) {
					break;
				} else {
					System.out.println("SL trong kho khong du!");
					System.out.println("Vui long nhap SL <= " + product.getQuantity());
				}
			}
			// tao don
			ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
			productOrderDao.add(productOrder);
			// update san pham
			product.setQuantity(product.getQuantity() - productOrder.getQuantity());
			productDao.update(product);
		}
	}

	public static void deleteFoodOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao id ");
		int id = sc.nextInt();

		ProductOrderDao productOrderDao = new ProductOrderDaoImpl();
		ProductOrder productOrder = productOrderDao.get(id);

		if (productOrder == null) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("San pham se bi xoa");
			info(productOrder);
			productOrderDao.delete(id);
			//// CAP NHAT SO LUONG
			// do thong tin product trong order ko day du
			// nen can lay lai product tu dao
			ProductDao productDao = new ProductDaoImpl();
			Product p = productDao.get(productOrder.getProduct().getId());

			p.setQuantity(p.getQuantity() + productOrder.getQuantity());
			productDao.update(p);
		}
	}

	public static void searchProductOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ten sp");
		String name = sc.nextLine();

		ProductOrderDao orderDao = new ProductOrderDaoImpl();
		List<ProductOrder> productOrders = orderDao.search(name);
		if (productOrders.isEmpty()) {
			System.out.println("Khong tim thay");
		} else {
			for (ProductOrder order : productOrders) {
				info(order);
			}
		}
	}

	public static void info(ProductOrder order) {
		System.out.println("Order ID: " + order.getId());
		System.out.println("Product Name: " + order.getProduct().getName());
		System.out.println("Price: " + order.getPrice());
		System.out.println("Quantity: " + order.getQuantity());
		System.out.println("Total: " + (order.getQuantity() * order.getPrice()));

	}
}
