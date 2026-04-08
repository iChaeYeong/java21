package exam12_상속후;

public class TestEmployee {

	public static void main(String[] args) {
//		Engineer e = new Engineer("홍길동",3,"기술");
		Employee a = new Engineer ("홍길동",3,"기술");
		Employee b = new Manager("화랑",4,"인사");
		
//		System.out.println(e.getEmployee());
		System.out.println(a);
		System.out.println(b);
//		System.out.println(e.toString());

	}

}
