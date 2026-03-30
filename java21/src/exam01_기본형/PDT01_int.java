package exam01_기본형;

public class PDT01_int {

	public static void main(String[] args) {
		// 실행되지 않는 문장: 주석문이라고 부른다.

		// 정수형 데이터 출력
		/*
		    정수형: 4가지
		    byte
		    short
		    int 
		    long
		    
		    10진수, 8진수, 2진수, 16진수 모두 사용가능
		 */
        //2진수
		System.out.println(0b01);
		System.out.println(0b10);
		System.out.println(0b11);
		System.out.println(0b100);
		System.out.println(0b101);
		
		System.out.println("========================================");
		  //8진수
		System.out.println(01);
		System.out.println(02);
		System.out.println(03);
		System.out.println(04);
		System.out.println(05);
		System.out.println(06);
		System.out.println(07);
		System.out.println("========================================");
		//16진수
		System.out.println(0x0);
		System.out.println(0x1);
		System.out.println(0x9);
		System.out.println(0xA);
		System.out.println(0xB);
		System.out.println(0xC);
		System.out.println(0xD);
		System.out.println(0xE);
		System.out.println(0xF);
		
		//큰 정수값
		long num = 9876545208L;
		
		
	}
}
