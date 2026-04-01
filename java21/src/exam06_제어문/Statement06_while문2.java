package exam06_제어문;

import java.util.Scanner;
public class Statement06_while문2 {

	public static void main(String[] args) {

		// 무한루프 ( 언제든지 빠져나올수 있는 로직 제공해야 됨)
	
		while(true) {			
			Scanner scan = new Scanner(System.in);
			System.out.println("========================");
			System.out.println("1. 이름입력");			
			System.out.println("2. 나이입력");			
			System.out.println("3. Quit");			
			System.out.println("========================");
			int num = scan.nextInt();
			if(num == 1) {
				String name =scan.next();
				System.out.println("이름:"+name);
			}else if(num == 2) {
				int age = scan.nextInt();
				System.out.println("나이:"+ age);				
			}else {
				System.out.println("프로그램 종료");		
				System.exit(0);
			}//end if
		}//end while
	}//end main
}//end class
