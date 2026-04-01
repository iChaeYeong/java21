package exam06_제어문;
public class Statement08_break {

	public static void main(String[] args) {

		// hello 3번만 출력하고 중지
		for(int n=1; n <= 5; n++) {
			if(n==4)break;
			System.out.println("Hello" + n);
		}
		System.out.println("END");
	}
}
