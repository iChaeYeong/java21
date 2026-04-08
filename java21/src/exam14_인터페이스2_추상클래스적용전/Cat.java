package exam14_인터페이스2_추상클래스적용전;

public class Cat extends Pet {

	String color;

	public Cat() {
	}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public void eat() {}
	
	@Override
	public void sleep() {}
}
