package java_8_practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java8_stream.Product;
public class JavaStream {
public static void main(String[] args) {
	 List<Product> productsList = new ArrayList<Product>();  
     //Adding Products  
     productsList.add(new Product(1,"HP Laptop",25000f));  
     productsList.add(new Product(2,"Dell Laptop",30000f));  
     productsList.add(new Product(3,"Lenevo Laptop",28000f));  
     productsList.add(new Product(4,"Sony Laptop",28000f));  
     productsList.add(new Product(5,"Apple Laptop",90000f));  
   //  productsList.stream().forEach(p->{System.out.println(p);}); 
    	//price above 30000
     productsList.stream().filter(product->product.getPrice()==30000).forEach(product->System.out.println(product.getName()));
     //accumulating price
     Float totalPrice = productsList.stream().map(product->product.getPrice()).reduce(0.0f,(sum,price)->sum+price);
     System.out.println("total price of product"+totalPrice);
     //sum using collector static method
     Float totalPrice2 = productsList.stream().map(product->product.getPrice()).reduce(0.0f,Float::sum);
     System.out.println("total price using sum"+totalPrice2);
     //accumulate price using collector method
     //give all the count of data min ave and max data
     DoubleSummaryStatistics totalPrice3 = productsList.stream().collect(Collectors.summarizingDouble(product->product.getPrice()));
     System.out.println("total price of product"+totalPrice3);
     //min and max price of product
     Product max = productsList.stream().max((product1,product2)->product1.getPrice()>product2.getPrice()? 1:-1).get();
     System.out.println("max price"+max);
     DecimalFormat df=new DecimalFormat("##.00");
     //count number of products base on the filter
     long count = productsList.stream().filter(product->product.getPrice()<30000).count();
     System.out.println(count);
     //filter product on base price collect it as set(remove duplicate element)
     Set<Float> collect = productsList.stream().filter(product->product.getPrice()<30000)
     .map(product->product.getPrice())
     .collect(Collectors.toSet());
     System.out.println(collect);
     //convert product into map
     Map<Integer, String> collect2 = productsList.stream().collect(Collectors.toMap(p->p.getId(),p->p.getName()));
     System.out.println(collect2);
     //fetching price by refreshing get price collect as list
     List<Float> collect3 = productsList.stream().filter(p->p.getPrice()>30000)
     .map(product->product.getPrice())
     .collect(Collectors.toList());//collecting as list
     System.out.println(collect3);
        
}
}
