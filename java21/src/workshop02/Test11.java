package workshop02;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("1.정수 입력하세요");
			int num1 = scan.nextInt();
			
			System.out.println("1.정수 입력하세요");
			int num2 = scan.nextInt();
			
			System.out.println("1.정수 입력하세요");
			int num3 = scan.nextInt();
			
			System.out.println("정수 "+num1+" 과 정수 "+num2+" , 정수 "+num3+" 중에서 최대값: "+
								(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3)));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}
	}
	
}
