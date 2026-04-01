package exam07_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {

	     // 이름을 배열로 관리: 홍길동,이순신,유관순 관리하자. ( 배열로 저장하고 출력까지 )
		
		String [] names;
		names = new String[3]; // null로 자동초기화
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		names[0]= "홍길동";
		names[1]= "이순신";
		names[2]= "유관순";
		
		for(int i=0; i < names.length ; i++) {
			System.out.printf("names[%d]=%s \n",i, names[i]);
		}
		
	}
}
