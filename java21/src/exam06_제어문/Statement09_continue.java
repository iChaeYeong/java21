package exam06_제어문;
public class Statement09_continue {

	public static void main(String[] args) {

		for(int n=1; n <= 5; n++) {
			
			System.out.println("Hello" + n);
			if(n==3)continue;
			System.out.println("world" + n);
			System.out.println("happy" + n);
		}
		System.out.println("END");
	}
}
