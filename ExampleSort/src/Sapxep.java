import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sapxep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 2, 1, 5, 6, 12, 87, 54, 63 };
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Sap xep la : " + arr[i]);
//		}
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(1);
		num.add(5);
		num.add(12);
		num.add(54);
		num.add(63);
		num.add(102);
		num.add(87);
		Collections.sort(num);
		System.out.println("Sau khi sap xep la : ");
		for(Integer in : num) {
			System.out.print(in + " ");
		}
		
		

	}

}
