package workshop03;

public class Test06 {
	public static void main(String[] args) {
		for (int i=1;i<=6;i++) {
			for (int j=1;j<=6;j++) {
				for (int t=1;t<=6;t++) {
					if ((i*j*t) % 3==0) {
						System.out.println(i+"*"+j+"*"+t+"="+(i*j*t));
					}
				}

			}
		}
	}
}
