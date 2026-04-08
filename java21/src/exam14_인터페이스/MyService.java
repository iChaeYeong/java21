package exam14_인터페이스;

public interface MyService {

		public static final int NUM=20;
		int SIZE = 30;
		
		public abstract void a();
		void b();
		
		public default void c() {
			System.out.println("기본");
		}
}
