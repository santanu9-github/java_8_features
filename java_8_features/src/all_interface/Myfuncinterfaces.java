package all_interface;

import java.util.function.BiFunction;

public class Myfuncinterfaces {

	public static void main(String[] args) {
		// BiFunction to add 2 numbers 
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
  
        // Implement add using apply() 
        System.out.println("Sum = " + add.apply(22, 3)); 
  
        // BiFunction to multiply 2 numbers 
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b; 
  
        // Implement add using apply() 
        System.out.println("Product = " + multiply.apply(2, 3)); 
        
        // Implement add using apply() 
        System.out.println("Product = " + multiply.apply(2475, 1392));
        
	}

}