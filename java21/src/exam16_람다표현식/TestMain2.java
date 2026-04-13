package exam16_람다표현식;


interface Flyer2{
	public abstract void fly2(int n);
}

public class TestMain2 {
	public static void main(String[] args) {
		
		Flyer2 f = new Flyer2() {
			@Override
			public void fly2(int n) {
				System.out.println("fly2 = "+n);
			}
		};
		f.fly2(3);
		
		Flyer2 f2 = (int n) ->{System.out.println("람다.fly2() = "+n);};
		f2.fly2(3);
	} 
}
