package exam07_배열;

public class ArrayTest01_1차원배열4 {

	public static void main(String[] args) {

	 
			// new + 리터럴
			
		    int [] num;
		    num = new int[] {10,20,30};
		    
		    String [] name = new String[] {"홍갈동","이순신"};
		    
		    for(int n: num) {
		    	System.out.println(n);
		    }
		    
		    for(String s: name) {
		    	System.out.println(s);
		    }
		
		
	}
}
