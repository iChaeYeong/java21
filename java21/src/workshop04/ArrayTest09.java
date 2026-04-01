package workshop04;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random r = new Random();
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = r.nextInt(1,10);
		}
		
		int sum = 0;
		int count=0;
		for (int a : arr3) {
			sum  += a;
			count++;
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println("sum= "+sum+"\nabg= "+sum/(float)count);
	}
}
