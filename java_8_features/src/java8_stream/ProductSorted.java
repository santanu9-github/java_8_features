package java8_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSorted {
public static void main(String[] args) {
	  List<Product> productsList = new ArrayList<Product>();  
      //Adding Products  
      productsList.add(new Product(1,"HP Laptop",25000f));  
      productsList.add(new Product(2,"Dell Laptop",30000f));  
      productsList.add(new Product(3,"Lenevo Laptop",28000f));  
      productsList.add(new Product(4,"Sony Laptop",28000f));  
      productsList.add(new Product(5,"Apple Laptop",90000f));  
      
//      Collections.sort(productsList,new Comparator<Product>() {
//		@Override
//		public int compare(Product a1, Product a2) {
//			return a1.getName().compareTo(a2.getName()) ;
//		}
//      });
      //using lambda expression
      System.out.println();
      Collections.sort(productsList,(a1,a2)->(a1.getId()-a2.getId()));
      System.out.println(productsList);
      
      //sort using stream
      productsList.stream().sorted((o1,o2)->(o1.getId()-o2.getId())).forEach(p->System.out.println(p));
      //method argument
      productsList.stream().sorted((o1,o2)->(o1.getId()-o2.getId())).forEach(System.out::println);
      //using comparator using method argument
      productsList.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);
      
}
}
