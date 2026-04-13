package exam16_람다표현식;


interface Flyer3{
	public abstract String fly3();
}

public class TestMain3 {
	public static void main(String[] args) {
		
		Flyer3 f = new Flyer3() {
			@Override
			public String fly3() {
				return "안녕하세요 fly3입니다.";
			}
		};
		System.out.println(f.fly3());
		
		Flyer3 f2 = () ->{return "람다 fly3";};
		System.out.println(f2.fly3());
	} 
}
