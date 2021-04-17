package Service;

import java.util.Scanner;

import Model.DiaChi;

public class AddressServiceImpl implements AddressService {

	@Override
	public void input(DiaChi dc1) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập tên thành phố :");
		dc1.setCity(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("Nhập tên đường :");
		dc1.setStreet(sc.nextLine());

		sc = new Scanner(System.in);
		System.out.println("Nhập tên quận :");
		dc1.setDistrict(sc.nextLine());
		
		sc = new Scanner(System.in);
		System.out.println("Nhập số nhà :");
		dc1.setNo(sc.nextInt());
		
	}

	@Override
	public void info(DiaChi dc1) {
		// TODO Auto-generated method stub
		System.out.println("Tên thành phố : " + dc1.getCity());
		System.out.println("Tên đường : " + dc1.getStreet());
		System.out.println("Tên quận :" + dc1.getDistrict());
		System.out.println("Số nhà :" + dc1.getNo());
	}

}
