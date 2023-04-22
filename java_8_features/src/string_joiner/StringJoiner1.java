package string_joiner;

import java.util.StringJoiner;

public class StringJoiner1 {
public static void main(String[] args) {
 StringJoiner sj=new StringJoiner(":","[","]");
	sj.add("santanu");
	sj.add("atanu");
	sj.add("pradeep");
	sj.add("pawan");
	System.out.println(sj);
StringJoiner sj1=new StringJoiner(":");
   sj1.add("sing");
   sj1.add("tripathy");
   
sj.merge(sj1);
System.out.println(sj);
}
}
