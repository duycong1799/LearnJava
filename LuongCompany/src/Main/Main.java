package Main;

import java.util.Scanner;



import Model.BaoVe;
import Model.DiaChi;
import Model.GiamDoc;
import Model.KeToan;
import Model.Person;
import Service.AddressService;
import Service.AddressServiceImpl;
import Service.PersonServiceImpl;

public class Main {
	public static void main(String[] args) {
		taoNhanVien();
	}

	public static void taoNhanVien() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số lượng nhân viên :");
		n = sc.nextInt();

		// 
		Person ng1 = new GiamDoc();
		Person ng2 = new KeToan();
		Person ng3 = new BaoVe();

		// address
		
		DiaChi add1 = new DiaChi();
		DiaChi add2 = new DiaChi();
		
//		AddressService addressService = new AddressServiceImpl();
//		addressService.inputAdd(add1);
//		addressService.inputAdd(add2);

		PersonServiceImpl personServiceImpl2 = new PersonServiceImpl();
		personServiceImpl2.input(ng1);
		personServiceImpl2.input(ng2);

///////////////////////////////////////////
		PersonServiceImpl personServiceImpl = new PersonServiceImpl();
		System.out.println("Nhap vao thong tin cua giam doc");
		personServiceImpl.input(ng1);
		System.out.println("Nhap vao thong tin cua ke toan");
		personServiceImpl.input(ng2);
		System.out.println("Nhap vao thong tin cua bao ve");
		personServiceImpl.input(ng3);
		System.out.println("_____________________");
		personServiceImpl.info(ng1);
		System.out.println("------------");
		personServiceImpl.info(ng2);
		System.out.println("------------");
		personServiceImpl.info(ng3);
	}
}
