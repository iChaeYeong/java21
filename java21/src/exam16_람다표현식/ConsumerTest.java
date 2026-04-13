package exam16_람다표현식;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("consumer: "+s);
			}
		};
		c.accept("hi");
		
		
		Consumer<String> c2 = s -> System.out.println("Consumer2: "+s);
		c2.accept("Heelo2");
		
		
		BiConsumer<String, Integer> c3 = (String s, Integer n)-> System.out.println("BiConsumer: "+s+"\t"+n);
		c3.accept("홍길동", 10);
		
		Supplier<String> s = () -> "hi";
		System.out.println(s.get());
		
		Function<String, Integer> f = (String a) -> {
			System.out.println("안에있는거 출력: " + a);
			return 10;
		};
		
		System.out.println(f.apply("뷁각ㄹ"));
		
	} 
}
