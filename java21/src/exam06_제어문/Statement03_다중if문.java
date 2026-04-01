package exam06_제어문;
import java.util.Scanner;
public class Statement03_다중if문 {

	public static void main(String[] args) {

		// Scanner 점수를 입력 받아서 학점을 출력하시오
		/*
		 *    점수         학점
		 *    ----------- ---
		 *    90~ 100      A 학점
		 *    80~ 89      B 학점
		 *    70~ 79      C 학점
		 *     0~ 69        F 학점
		 * 
		 */
		
	   Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int num = scan.nextInt();
		
		if(num >=90 ) {
			System.out.println("A학점");
		}else if(num >=80 ) {
			System.out.println("B학점");
		}else if(num >=70 ) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");			
		}
		scan.close();
//		
//		if(num >=90 && num <=100) {
//			System.out.println("A학점");
//		}else if(num >=80 && num <=89) {
//			System.out.println("B학점");
//		}else if(num >=70 && num <=79) {
//			System.out.println("C학점");
//		}else {
//			System.out.println("F학점");			
//		}
		
		
	}
}
