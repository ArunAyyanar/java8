package refresh;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = (n) -> n > 100;
		
		System.out.println(p1.test(102));
		System.out.println(p1.test(12));
		
	}

}
