package exam11_static3;

public class StackBlockTest {
	
	static {
		int num = 0;
		System.out.println("초기화진행@@@@@@@@@@@");
	}
	public static void main(String[] args) {
		int num = 0;
		num++;
		System.out.println(num);;

	}

}
