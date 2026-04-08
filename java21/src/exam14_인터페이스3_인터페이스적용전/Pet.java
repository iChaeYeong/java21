package exam14_인터페이스3_인터페이스적용전;

public abstract class Pet {

	String name;
	int age;
	
	public abstract void eat();
	
	public abstract void sleep();

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Pet() {
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
}
