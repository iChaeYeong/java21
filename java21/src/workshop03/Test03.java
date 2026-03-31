package workshop03;

public class Test03 {
	public static void main(String[] args) {
		int i = 0;
		while (i<=10) {
			int j =0;
			while (j<=i) {
				System.out.println(i+"*"+j);
				j++;
			}
			i++;
		}
	}
}
