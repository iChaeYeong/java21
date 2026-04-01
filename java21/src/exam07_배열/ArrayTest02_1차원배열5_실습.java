package exam07_배열;

public class ArrayTest02_1차원배열5_실습 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum = 0;
		for (int i = 0 ; i<num.length;i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		
		String [] name = {"홍길동","세조","정조","단종","박혁거세"};
		int count = 0;
		for (int i = 0 ; i<name.length;i++) {	
			if (name[i].length()>=2) {
				count++;
				System.out.println(name[i]);
			}
		}
		System.out.println(count);
		
		
	}

}
