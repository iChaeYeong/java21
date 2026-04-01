package exam06_제어문;
public class Statement05_for문2 {

	public static void main(String[] args) {

		// hello 문자열 5번 출력
		
		for(int n=0; n <= 4; n++) {
			System.out.println("Hello" + n);
		}
		System.out.println("===========================");
		
		for(int n=10; n >= 6; n--) {
			System.out.println("world" + n);
		}
        System.out.println("===========================");
		
		for(int n=0; n < 10; n+=2) {
			System.out.println("홍길동" + n);
		}  
		
       System.out.println("===========================");
		
		for(int n=0, n2=1; n < 10 && n2 < 4; ++n, ++n2) {
			System.out.println("이순신" + n);
		}  
		
		System.out.println("===========================");
		
		for(int n=0; n <= 4; n++) {
			for(int n2=0; n2 <= 4; n2++) {
				System.out.println("happy");
			}
		}
		
		
	}
}
