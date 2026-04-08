package exam11_static;

class Count{
	static int num = 0;
	
	public Count() {
		num++;
	}
}

public class StaticTest1 {

	public static void main(String[] args) {
		System.out.println(Count.num);
		Count a = new Count();
		Count b = new Count();
		
		System.out.println(Count.num);
	}

}
