package exam09_class;

public class Test_01 {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		c1.name = "나비";
		c1.age = 5;
		c1.gender = "암컷";
		
		c2.name = "뭉치";
		c2.age = 3;
		c2.gender = "수컷";
		
		
		c1.eat();
		c1.cry();

		c1.eat();
		c2.cry();
		
		
	}

}
