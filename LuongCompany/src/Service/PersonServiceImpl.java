package Service;

import java.util.Scanner;

import Model.BaoVe;
import Model.GiamDoc;
import Model.Person;
import Model.KeToan;


public class PersonServiceImpl implements PersonService{

	@Override
	public void input(Person pers) {
		// TODO Auto-generated method stub
		
		if (pers instanceof GiamDoc) {
			Scanner sc = new Scanner(System.in);
			GiamDoc gd = (GiamDoc) pers;
			System.out.println("Nhap luong phan cong cong viec :");
			gd.setBoss(sc.nextLine());
		} else if (pers instanceof KeToan) {
			Scanner sc = new Scanner(System.in);
			KeToan kt = (KeToan) pers;
			System.out.println("Nhap thong tin quan sat nhan vien :");
			kt.setQuansatnhanvien(sc.nextLine());
		} else if (pers instanceof BaoVe) {
			Scanner sc = new Scanner(System.in);
			BaoVe bv = (BaoVe) pers;
			System.out.println("Nhap so luong chia khoa bao ve cam : ");
			bv.setKey(sc.nextInt());
		}
	}

	@Override
	public void info(Person pers) {
		// TODO Auto-generated method stub
		if (pers instanceof GiamDoc) {
			Scanner sc = new Scanner(System.in);
			GiamDoc gd = (GiamDoc) pers;
			System.out.println("So luong phan cong cong viec" + gd.getBoss());
		} else if (pers instanceof KeToan) {
			Scanner sc = new Scanner(System.in);
			KeToan kt = (KeToan) pers;
			System.out.println("Thong tin thu duoc ve quan sat nhan vien :" + kt.getQuansatnhanvien());

		} else if (pers instanceof BaoVe) {
			Scanner sc = new Scanner(System.in);
			BaoVe bv = (BaoVe) pers;
			System.out.println("So luong chia khoa bao ve cam" + bv.getKey());

		}
		
	}@Override
	public void luong(Person pers) {
		
		// TODO Auto-generated method stub
		if( pers instanceof GiamDoc) {
			System.out.println("Luong cua giam Doc la 10 trieu");
		}else if(pers instanceof KeToan) {
			System.out.println("Luong cua Ke Toan la 8 trieu");
		}else if(pers instanceof BaoVe) {
			System.out.println("Luong cua Bao Ve la 5 trieu");
		}
	}
	

}
