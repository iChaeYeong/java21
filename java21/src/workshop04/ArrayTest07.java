package workshop04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람수:");
		int peopleCount = scan.nextInt();
		int [] arr = new int[peopleCount];
		
		for (int i = 0 ; i < arr.length; i++) {
			Random r = new Random();
			
			// seed 고정: 항상 동일한 값 반환
			//r.setSeed(1234);
			arr[i] = r.nextInt(140,200);
			System.out.println("사람" +(i+1)+": "+arr[i]);
			
		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값은 "+arr[arr.length-1]+"입니다.");
		
	}
}
