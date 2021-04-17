package GiaiPhuongTrinhBac2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
	public static void main(String[] args) {
		giaiBac2();
	}

	public static void giaiBac2() {
		// ax2+bx+c

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a :");
		int a = sc.nextInt();
		System.out.print("Nhap b :");
		int b = sc.nextInt();
		System.out.print("Nhap c :");
		int c = sc.nextInt();
		// tinh delta
		int delta = b * b - 4 * a * c;
		float canDelta = (float) Math.sqrt(delta);
		System.out.println("---------------");
		if (delta > 0) {
			// String s1 = "Phuong trinh co nghiem x1 là :" + ((-b + canDelta) / (2 * a));
			// String s2 = "Phuong trinh co nghiem x2 là :" + ((-b - canDelta) / (2 * a));
			System.out.println("Phuong trinh co nghiem x1 là :" + "x =" + ((-b + canDelta) / (2 * a)));
			System.out.println("Phuong trinh co nghiem x2 là :" + "x =" + ((-b - canDelta) / (2 * a)));

		} else if (delta == 0) {
			// String s3 = "Phuong trinh co nghiem kep là :" + (-b / (2 * a));
			System.out.println("Phuong trinh co nghiem kep là :" + "x =" + (-b / (2 * a)));
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}

	}

}
