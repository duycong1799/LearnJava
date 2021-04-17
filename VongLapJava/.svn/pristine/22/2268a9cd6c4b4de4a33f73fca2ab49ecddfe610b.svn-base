import java.util.Scanner;

public class VongLapWhile {
	public static void main(String[] args) {
		hello();
		luaChonDapAn();
		menu();
		bangCuuChuong();
	}

	public static void hello() {

		int i = 1;
		while (i < 10) {
			System.out.println("Xin chao");
			System.out.println(i);
			i++;// i=i+1
		}
		System.out.println("END");

	}

	public static void luaChonDapAn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long chon dap an tu 1-4");
		int a = sc.nextInt();
		while (a > 4 || a < 1) {
			System.out.println("Vui long chon lai");
			a = sc.nextInt();// cho họ nhập lại

		}
		System.out.println("Ban chon " + a);

	}

	public static void menu() {
		System.out.println("Vui long chon ngon ngu");
		System.out.println("1.java");
		System.out.println("2.javascript");
		System.out.println("3.SQL");

		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long chon");
		int a = sc.nextInt();
		while (a > 3 || a < 1) {
			System.out.println("Vui long chon lai");
			a = sc.nextInt();// cho họ nhập lại

		}
		System.out.println("Ban chon " + a);
	}

	public static void bangCuuChuong() {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		while (i <= 9) {
			int k = 1;
			while (k <= 9) {
				int tich = i * k;
				System.out.println(i + "x" + k + "=" + tich);
				k++;// k=k+1
			}
			//tang i 
			i++;
		}
	}
}
