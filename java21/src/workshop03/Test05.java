package workshop03;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력하시오");
	int num = scan.nextInt();
	int cnt = 0;
	int sum = 0;
	for (int i=1;i<=num;i++) {
		if(i%2==0) {
			sum += i;
			cnt++;
		}
	}
	System.out.println("총합:"+sum+"평균값:"+sum/(float)cnt);
	scan.close();
	}
}
