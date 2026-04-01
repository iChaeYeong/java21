package exam07_배열;

public class ArrayTest01_1차원배열5_실습 {

	public static void main(String[] args) {

		//실습1: 제공된 배열의 총합을 구하시오
		int [] num = { 1,2,3,4,5};
		
		int sum = 0;
		for( int n : num ) {
			sum = sum + n;  // sum+=n;
		}
		System.out.println(" 총합:" + sum);
		
		
		//실습2: 제공된 이름중에서 글자수가 2글자인 인원수 출력하시오
		// 문자열 길이:  s.length()
		
		String [] name = {"홍길동","세조","정조","단종","박혀거세"};
		
		int count = 0;
		String mesg = "";
		for(String s : name ) {
			if(s.length() == 2) {
				count++;
				mesg = mesg + s;
			}
		}
		System.out.println("인원수:" + count);
		System.out.println("이름:" + mesg);
	}
}
