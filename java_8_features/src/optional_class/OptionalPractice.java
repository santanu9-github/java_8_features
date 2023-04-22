package optional_class;

import java.util.Optional;

import java8_stream.Product;

public class OptionalPractice {
	int a=10;
	
public static void main(String[] args) {
	
	//traditional way to handel nullpointer exceptional
	try {
	 OptionalPractice op=null;
	System.out.println(op.a);
	}catch(NullPointerException n) {
		System.out.println(n);
	}
	
	//using optional class to handel
	 OptionalPractice op=null;
	 Optional<OptionalPractice> ofNullable = Optional.ofNullable(op);
	 if(ofNullable.isPresent()) {
		 System.out.println(op.a);
	 }else {
		 System.out.println("opject not present");
	 }
	 //handel product nullpointer exception
	 Product pList=new Product(1,"santanu",90f);
	 
//	 Optional<Object> empty = Optional.empty();
//	 System.out.println(empty);
//	 //if u know your object will never null then go with of method
//	 Optional<String> of = Optional.of(pList.getName());
//	 System.out.println(of);
//	 //f u know your object may be null or not then go with ofNullable method
     Optional<String> ofNullable2 = Optional.ofNullable(pList.getName());
//	 if(ofNullable2.isPresent()) {
//		 System.out.println(ofNullable2.get() );
//	 }
	// System.out.println(ofNullable2.orElse("santanu")); 
	// System.out.println(ofNullable2.orElseThrow(()->new IllegalArgumentException("name not found")));
	 System.out.println(ofNullable2.map(String::toUpperCase).orElseGet(()->"default name..."));
	 
}
}
