package exam17_유틸리티;

public class StringTest {
	public static void main(String[] args) {
		String s = "helLO";

		int n = s.length();
		System.out.println("1. 문자열길이: "+n);	//1. 문자열길이: 5
		
		char c = s.charAt(0);
		System.out.println("2. 특정위치의 문자얻기: "+c);		//2. 특정위치의 문자얻기: h
		
		//1부터 끝까지 
		System.out.println("3. 부분열: "+s.substring(1));		//3. 부분열: elLO
		
		//1부터 3까지
		System.out.println("3. 부분열: "+s.substring(1,4));	//3. 부분열: elL
		
		System.out.println("4. 대문자로 변환: "+s.toUpperCase());	//4. 대문자로 변환: HELLO
		
		System.out.println("5. 소문자로 변환: "+s.toLowerCase());	//5. 소문자로 변환: hello
		
		String s2 = "          world              ";
		System.out.println("6. 양쪽 공백제거: "+ s2.strip());
		System.out.println("7. 왼쪽 공백제거: "+ s2.stripLeading());
		System.out.println("8. 오른쪽 공백제거: " + s2.stripTrailing());		
	}

}
