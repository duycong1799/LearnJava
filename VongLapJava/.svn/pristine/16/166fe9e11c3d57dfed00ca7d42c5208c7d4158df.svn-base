import java.util.Scanner;

public class VongLapDoWhile {
	public static void main(String[] args) {
		hello();
		//menu();
		luaChonDapAn();
		bangCuuChuong();
	}

	public static void hello() {

		int i = 1;
		do {
			System.out.println("Xin chao");
			System.out.println(i);
			i++;// i=i+1
		} while (i < 10);
		System.out.println("END");

	}

	public static void menu() {
		System.out.println("Vui long chon ngon ngu");
		System.out.println("1.java");
		System.out.println("2.javascript");
		System.out.println("3.SQL");

		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long chon");
		int a = sc.nextInt();
		 do{
			System.out.println("Vui long chon lai");
			a = sc.nextInt();// cho họ nhập lại

		}while (a > 3 || a < 1);
		System.out.println("Ban chon " + a);
	}

	public static void luaChonDapAn() {
		
		int a = 100;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Vui long chon dap an tu 1-4");
			a = sc.nextInt();// cho họ nhập lại

		} while (a > 4 || a < 1);
		System.out.println("Ban chon " + a);

	}
	public static void bangCuuChuong() {
		int i = 1;

		Scanner sc = new Scanner(System.in);
		do {
			int k = 1;
			while (k <= 9) {
				int tich = i * k;
				System.out.println(i + "x" + k + "=" + tich);
				k++;// k=k+1
			}
			//tang i 
			i++;
		}while (i <= 9);
	}

}
