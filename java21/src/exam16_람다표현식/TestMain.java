package exam16_람다표현식;


interface Flyer{
	public abstract void fly();
}

public class TestMain {
	public static void main(String[] args) {
		
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly()");
			}
		};
		f.fly();
		
		Flyer f2 = () ->{System.out.println("람다.fly()");};
		f2.fly();
	} 
}
