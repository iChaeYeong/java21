package exam12_상속2_상속후;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer eng = new Engineer("유관순", 1800, "자바");
		
		System.out.println(m.getManager());
		System.out.println(eng.getEngineer());
		
		//수정: 원래는 setter 메서드 이용
		m.salary = 3000;
		//조회: 원래는 getter 메서드 이용
		System.out.println(m.name +"\t"+ m.salary +"\t"+m.depart);
		
	}

}
