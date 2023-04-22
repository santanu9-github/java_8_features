package java8_stream;

import java.util.ArrayList;
import java.util.List;

public class PracticeStream {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("sun");
	l.add("sat");
	l.add("rty");
	l.add("iuy");
	l.stream().filter(f->f.startsWith("s")).forEach(p->System.out.println(p));
}
}
