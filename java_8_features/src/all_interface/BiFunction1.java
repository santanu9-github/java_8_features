package all_interface;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunction1 {
public static void main(String[] args) {
	BiFunction<Integer,Integer,Integer> add=(a,b)-> a+b;
	System.out.println("sum ="+add.apply(22,43));
	
	BiFunction<Integer,Integer,Integer> multyply=(a,b)->a*b;
	System.out.println("multyply"+multyply.apply(12,13));
	
	Predicate<Integer> lessthen=i->(i<18);
	System.out.println(lessthen.test(20));
	
}
}
