package exam09_class3_this;

// 재사용 클래스
public class Cat {  // 고양이객체
	
	 String name;
	 int age;
	 String gender;

	public void eat() {
		System.out.println("쩝쩝");
	}
	public void cry() {
		System.out.println("야옹~");		
	}
	//3. 생성자
	//오버로딩(overloading)생성자	
	public Cat() {
	}
	//초기화하는 진짜 생성자
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Cat(String name, int age) {
		this(name, age, null); //반드시 첫라인에서 사용
		System.out.println();
//		this.name = name;
//		this.age = age;
	}
	
	
}
