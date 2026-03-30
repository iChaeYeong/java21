package workshop02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("1.정수 입력하세요.");
			int num1 = scan.nextInt();
			
			System.out.println("2.정수 입력하세요.");
			int num2 = scan.nextInt();
			
			System.out.println("정수 "+num1+" 과 정수 "+num2+" 중에서 최대값: "+(num1>num2?num1:num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}

	}

}
