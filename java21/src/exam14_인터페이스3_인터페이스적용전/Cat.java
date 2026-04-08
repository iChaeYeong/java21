package exam14_인터페이스3_인터페이스적용전;

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
	
	public void eat() {}
	public void sleep() {}
}
