package javamethod;

public class HamJava {
	public static void main(String[] args) {
		int A = 1;
		int B = 20;
		int tong = A + B;
		String s = "Tong 2 so la " + tong;
		System.out.println(s);
		inKetQuaRaManHinh();
		// su dung ham
		tong2So(5, 10);/// thuong x=5,y=10
		hieu2So();
		// su dung gia tri cua ham hieu
		int ketQuaHieuxy = hieu2So();
		System.out.println("KQ : " + ketQuaHieuxy);
		tich2So(5, 5);
		int x = 10;
		int y = 2;
		int ketQuaTich2So = tich2So(x, y);
		System.out.println("KQ Tich : " + ketQuaTich2So);
		thuong2So(30, 6);
	}

	// khaibaoham
	public static void inKetQuaRaManHinh() {
		int x = 10;
		int y = 20;
		int tong = x + y;
		System.out.println("Tong = " + tong);
		return;// optional:ko batbuoc
	}

	// khai bao ham co tham so truyen vao
	public static void tong2So(int x, int y) {
		// int x = 10 ;
		// int y = 20 ;
		int tong = x + y;
		System.out.println("Tong = " + tong);
	}

	public static int hieu2So() {
		int x = 10;
		int y = 5;
		int hieu = x - y;
		System.out.println("Hieu = " + hieu);
		return hieu;
	}

	public static int tich2So(int x, int y) {
		// int tich = x*y;
		// System.out.println("Tich : " + tich );
		return x * y;
	}

	public static void thuong2So(int x, int y) {
		int thuong = x / y;
		System.out.println("Thuong : " + thuong);
	}

}
