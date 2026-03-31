package workshop03;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기");
		int num;
		int sum = 0;
		
		while(true) {
			System.out.print("n 값:");
			num = scan.nextInt();
			
			if (num <= 0) {
				continue;
			}else {
				for (int i = 1; i<= num; i++) {
					sum += i;
				}
				break;
			}
		}
		System.out.println("1부터 "+num+" 까지의 총합: "+sum);
		scan.close();
	}
}


// 이거 코테에 나올법한 문제 한번 답지 보기