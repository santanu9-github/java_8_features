package java8_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapStreamApi {
public static void main(String[] args) {
	Map<String,Integer> data=new HashMap<>();
	data.put("two",2);
	data.put("three",3);
	data.put("five",5);
	data.put("six",6);
	data.put("one",1);
	//sort map using stream api
	data.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	//sort map using 
	data.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	
	
	//product data store in map
	 Map<Product,Integer> productsList = new HashMap<>();  
     //Adding Products  
     productsList.put(new Product(1,"HP Laptop",25000f),5);  
     productsList.put(new Product(2,"Dell Laptop",30000f),3);  
     productsList.put(new Product(3,"Lenevo Laptop",28000f),7);  
     productsList.put(new Product(4,"Sony Laptop",28000f),2);  
     productsList.put(new Product(5,"Apple Laptop",90000f),8);  
     //sort product map
     productsList.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getPrice))).forEach(System.out::println);
     //sorting product map in reverse
     productsList.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getPrice).reversed())).forEach(System.out::println);
}
}
