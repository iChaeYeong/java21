package workshop03;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오");
		int num = scan.nextInt();

		int sum = 0;
		String result = "";
		boolean isFirst = true;
		result += num;
		
		
		for (int i = num + 1; i <= 100; i++) {
			if (i % num == 0) {
				sum += i;
				if (!isFirst) {
					result += "+" + i;
				}
			}
			isFirst = false;
		}
		System.out.println(result + "=" + sum);
		scan.close();
	}
}

// 이거 코테에 나올법한 문제 한번 답지 보기