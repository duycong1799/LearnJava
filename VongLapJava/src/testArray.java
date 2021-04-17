import java.util.Scanner;

public class testArray {
	public static void main(String[] args) {
		testArray();
		minMax();
	}

	public static void testArray() {
		int x0 = 1;
		int x1 = 10;
		int x2 = 20;
		// su dung mang
		int[] numbers = new int[5];

		numbers[0] = 1;
		numbers[4] = 90;
		numbers[1] = 5;
		numbers[2] = 6;
		numbers[3] = 7;
		int tong = numbers[0] + numbers[4];
		System.out.println("Tong la : " + tong);
		System.out.println("===============");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Phan tu " + i + " co gia tri la : " + numbers[i]);
		}
		// Tinh rong cac phan tu trong mang
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			// viet tat sum += numbers[i];

		}
		System.out.println("Tong cua mang la : " + sum);
		System.out.println("================");
		
		
		// in phan tu tu cuoi len dau
		for (int i = numbers.length - 1; i > 0; i--) {
			System.out.println("Phan tu " + i + " co gia tri la : " + numbers[i]);
		}
		System.out.println("=================");
	}

	public static void minMax() {
		double[] numbers = new double[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Nhap vao phan tu " + i);
			Scanner sc = new Scanner(System.in);
			numbers[(int) i] = sc.nextDouble();
		}
		double min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Min" + min);
		
		double max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max" + max);
	}
	
	
	
}