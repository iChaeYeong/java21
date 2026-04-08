package exam09_class4_실습;

public class TestStudent {

	public static void main(String[] args) {

		/*
		 *   3명의 학생 관리
			  홍길동 20 서울
			  이순신 44 광주
			  유관순 18 
		 */
		
		Student s1 = new Student("홍길동",20, "서울");
		Student s2 = new Student("이순신",44, "광주");
		Student s3 = new Student("유관순", 18);
		
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s1.name, s1.age, s1.address);
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s2.name, s2.age, s2.address);
		System.out.printf("이름:%s, 나이:%d, 주소:%s \n", s3.name, s3.age, s3.address);
		
	}
}
