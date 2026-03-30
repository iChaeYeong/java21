package workshop02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("주소를 입력하시오.");
			String address = scan.nextLine();	//next 로 하니까 공백생기면 끊어버림 nextLine()으로 하기
			
			String[] strArr = address.split(" ");
			System.out.println(strArr.length);
			System.out.println("도명: "+strArr[0]);
			System.out.println("시명: "+strArr[1]);
			System.out.println("구명: "+strArr[2]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}
	}
	
}
