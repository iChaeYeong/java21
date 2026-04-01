package exam06_제어문;
public class Statement05_for문4_실습 {

	public static void main(String[] args) {

		//문제1: 1~20까지 반복하는데 짝수값만 출력하시오.
		for(int n=1; n <=20; n++) {
			if(n%2 == 0) {
			   System.out.println(n);
			}
		}
		System.out.println("================================");
		//문제2: 1~20까지 반복하는데 3의배수만 출력하시오.
		for(int n=1; n <=20; n++) {
			if(n%3 == 0) {  //  (n%3==0) && (n%5==0) <== 3의배수이면서 5의배수
			   System.out.println(n);
			}
		}
		//문제3: 1~20까지 반복해서 총합을 출력하시오.
		int sum=0;
		for(int n=1; n <=20; n++) {
			sum = sum + n; // sum+=n;
		}
		System.out.println("sum:" + sum);
		
		//문제4: 1~20까지 반복해서 짝수값의 총합을 출력하시오.
		int sum2=0;
		for(int n=1; n <=20; n++) {
		   if(n%2==0) {
			   sum2 = sum2 + n; // sum+=n;
		   }
		}
		System.out.println("sum2:" + sum2);
		
	}
}
