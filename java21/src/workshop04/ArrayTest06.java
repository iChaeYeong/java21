package workshop04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사람수:");
		int peopleCount = scan.nextInt();
		int [] arr = new int[peopleCount];
		
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print("사람" +(i+1)+": ");
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		System.out.println("최대값은 "+arr[arr.length-1]+"입니다.");
		
	}
}
