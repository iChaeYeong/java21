package exam04_연산자;

public class Operator04_논리연산자1 {

	public static void main(String[] args) {

		// && : and 연산자
		
		System.out.println(true && true );  // true
		System.out.println(true && false ); // false
		System.out.println(false && true ); // false
		System.out.println(false && false ); // false
		
		System.out.println("**********************");
		

		// || : or 연산자
		
		System.out.println(true || true );  // true
		System.out.println(true || false ); // true
		System.out.println(false || true ); // true
		System.out.println(false || false ); // false
		
		System.out.println("**********************");
		
		// ! : not 연산자
		
		System.out.println(! true);   // false
		System.out.println(! false);  // true
	}

}
