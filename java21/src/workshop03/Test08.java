package workshop03;

public class Test08 {
	public static void main(String[] args) {
		for (int i=1+1;i<=100;i++) {
			String result="";
			result = i + " ";
			if (i%3==0) {
				result+="foo ";
			}
			
			if (i%5==0) {
				result+="bar ";
			}
			
			if (i%7==0) {
				result+="baz ";
			}
			
			System.out.println(result);
		}
		
	}
}


// 이거 코테에 나올법한 문제 한번 답지 보기