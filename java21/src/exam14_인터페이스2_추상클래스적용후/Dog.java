package exam14_인터페이스2_추상클래스적용후;

public class Dog extends Pet {

	String gender;

	public Dog() {
		
	}

	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	
	public void eat() {}
	public void sleep() {}
	
	
}
