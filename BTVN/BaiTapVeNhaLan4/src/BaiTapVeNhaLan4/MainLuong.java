package BaiTapVeNhaLan4;

public class MainLuong {
	public static void main(String[] args) {
		BangLuongBaoVe();
		BangLuongGiamDoc();
		testConstructor();
	}

	public static void testConstructor() {
		BaoVe baovesang = new BaoVe("Nguyen Van A",21, "Hai Duong", 5000000);
		System.out.println("Luong : " + baovesang.getLuong());
		System.out.println("-------------------");

		GiamDoc Manager = new GiamDoc("Tran Van V",21, "Ha Noi",baovesang.getLuong()*3000000);
		System.out.println("Luong : " + baovesang.getLuong());

	}

	public static void BangLuongBaoVe() {
		BaoVe bv1 = new BaoVe();
		bv1.setName("Nguyen Van A");
		bv1.setAge(21);
		bv1.setAdress("Hai Duong");
		bv1.setLuong(5000000);

		System.out.println(bv1.getName());
		System.out.println(bv1.getAge());
		System.out.println(bv1.getAdress());
		System.out.println(bv1.getLuong());

	}

	public static void BangLuongGiamDoc() {
		GiamDoc gd = new GiamDoc();
		gd.setName("Tran Van V");
		gd.setAge(28);
		gd.setAdress("Ha Noi");
		gd.setLuong(15000000);

		System.out.println(gd.getName());
		System.out.println(gd.getAge());
		System.out.println(gd.getAdress());
		System.out.println(gd.getLuong());
	}
}
