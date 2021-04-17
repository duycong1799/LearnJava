
public class VongLapFor {
	public static void main(String[] args) {
		hello();
		bangCuuChuong();

	}

	public static void hello() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Xin chao");
			System.out.println(i);
			if (i == 4) {
				break;
			}

		}
		System.out.println("END");

	}

	public static void bangCuuChuong(){
		
		for (int i =1; i<= 9;i++) {
			//int k = 1;
			for (int k = 1;k<= 9;k++) {
				int tich = i * k;
				System.out.println(i + "x" + k + "=" + tich);
				//k1++;// k=k+1
			}
		
		}
}
}