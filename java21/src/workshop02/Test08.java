package workshop02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("정수 입력하세요.");
			int a1 = scan.nextInt();
			
			System.out.println("정수 입력하세요.");
			int a2 = scan.nextInt();
			
			System.out.println("정수 "+a1+" 과 정수 "+a2+" 의 합계: "+(a1+a2));
			
		}catch(NullPointerException e){
			
		}finally {
			scan.close();
		}
		
	}

}
