package workshop03;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		
		System.out.print("a 값:");
		int num1 = scan.nextInt();
		
		System.out.print("b 값:");
		int num2 = scan.nextInt();
		
		System.out.print("c 값:");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("최대값:"+num1); 
			}else {
				System.out.println("최대값:"+num3);
			}
		}else {
			if(num2 > num3) {
				System.out.println("최대값:"+num2); 
			}else {
				System.out.println("최대값:"+num3);
			}
		}
		
		
		scan.close();
	}
}


// 이거 코테에 나올법한 문제 한번 답지 보기