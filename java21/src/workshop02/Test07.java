package workshop02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("이름을 입력하세요");
			String name = scan.next();
			
			
			System.out.println("나이를 입력하세요");
			int age = scan.nextInt();
			
			System.out.println("이름은 "+age+"나이는 "+name+" 입니다");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			scan.close();
		}
		
		
		

	}

}
