package exam06_제어문;

import java.util.Scanner;

public class Statement03_다중if문 {

	public static void main(String[] args) {
		/*
		 * 90-100 A
		 * 80-89 B
		 * 70 - 79 C
		 * 0 - 69 F
		 * */
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("점수를 입력하세요:");
			int num = scan.nextInt();
			char alpha;
			if (num >= 90 && num <= 100) {
				alpha = 'A';
			}else if (num >= 70) {
				alpha = 'B';
			}else if (num >= 60) {
				alpha = 'C';
			}else {
				alpha = 'F';
			}
			
			System.out.println(alpha);
			
		}catch(Exception e){
			
		}finally {
			
		}
	}

}
