package java8_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce {
public static void main(String[] args) {
	List<Integer> number=Arrays.asList(3,5,6,1,8,9);
	List<String>words=Arrays.asList("java","spring","hibernate");
	int sum=0;
	for (Integer no : number) {
		sum+=no;
	}
	System.out.println(sum);
	//using sum method
	int sum2 = number.stream().mapToInt(i->i).sum();
	System.out.println(sum2);
	//using reduce method
	Integer reduceMap = number.stream().reduce(0,(a,b)->(a+b));
	System.out.println(reduceMap);
	//using sum method argument
	Optional<Integer> reduceMap1 = number.stream().reduce(Integer::sum);
	System.out.println(reduceMap1.get());
	//multiply using reduce
	Integer multiolyreduce = number.stream().reduce(1,(a,b)->(a*b));
	System.out.println(multiolyreduce);
	//find max value using reduce
	Integer maxNum = number.stream().reduce(1,(a,b)->(a>b)?a:b);
	System.out.println(maxNum);
	//find max value using method reference
	Integer maxNum2 = number.stream().reduce(Integer::max).get();
	System.out.println(maxNum2);
	//find longest string
	Optional<String> Slength = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
	System.out.println(Slength.get());
	//
	
}
}
