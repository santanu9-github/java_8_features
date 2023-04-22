package java_8_practice;

import java.util.ArrayList;

public class Java8 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("jon");
	list.add("don");
	list.add("lion");
	list.add("tiger");
	list.forEach((value)->{System.out.println(value);});
	
	Practice1 p1=()->
	System.out.println("void method");

	p1.addOne();
	Practice2 p2=(i,u)->(i+u);
	
	System.out.println(p2.addTwo(10, 20));
	
	Practice3 p3=(a,b)->(a*b);
	System.out.println(p3.addThree(20f, 40f));
}
}
