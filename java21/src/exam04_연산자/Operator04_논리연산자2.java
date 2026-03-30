package exam04_연산자;

public class Operator04_논리연산자2 {

	public static void main(String[] args) {

		// 실제 활용
		
		int n = 10;
		int n2 = 20;
		
		//질문? n 값이 15보다 크고 n2 값이 30 보다 작냐?
		
		boolean result = (n > 15) && (n2 < 30);
		System.out.println(result);
		
		System.out.println((n > 15) && (n2 < 30));
	
		//질문? n 값이 15보다 크거나 n2 값이 30 보다 작냐?
		boolean result2 = (n > 15) || (n2 < 30);
		System.out.println(result2);
		
		
	}

}
