package exam14_인터페이스2_추상클래스적용전;

public class Bird extends Pet {

	public Bird() {
	}

	public Bird(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {}
	
	@Override
	public void sleep() {}
	
}
