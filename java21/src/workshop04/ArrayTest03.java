package workshop04;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int sum = 0;
		int count = 0;
		for (int [] a : arr2) {
			for (int i : a) {
				sum += i;
				count ++;
			}
		}
		
		System.out.println("sum="+sum);
		System.out.println("avg="+sum/(float)count);
		
	}
}
