package workshop04;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest10 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] arr = new int[2][2];
		float sum = 0;
		if (args.length != 2) {
			System.out.println("다시 입력 하세요");
		} else {
			for (int i = 0; i < args.length; i++) {
				int num = Integer.parseInt(args[i]);
				
				arr[0][i] = num;
				arr[1][i] = r.nextInt(1,5);
				
				sum += arr[0][i]+arr[1][i];
			}
			System.out.println(Arrays.toString(arr[0]));
			System.out.println(Arrays.toString(arr[1]));
			System.out.println("sum="+sum);
			System.out.println("avg="+sum/(arr.length * arr[0].length));
			
		}
	}
}
