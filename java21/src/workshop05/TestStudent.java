package workshop05;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student("kim",100,90,95,89);
		Student st2 = new Student("Lee",60,70,99,98);
		Student st3 = new Student("Park",68,86,60,40);
		
		System.out.println(st1.getGrade());
		System.out.println(st2.getGrade());
		System.out.println(st3.getGrade());
	}

}
