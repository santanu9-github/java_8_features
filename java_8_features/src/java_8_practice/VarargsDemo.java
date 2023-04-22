package java_8_practice;

public class VarargsDemo {
public static void main(String[] args) {
	System.out.println("adding 5,7");
	add(5,7);
	System.out.println("adding 8,9,7");
	add(8,9,7);
	System.out.println("adding 2,3,4,5,9");
	add(2,3,4,5,9);
}
public static void add(int...v) {
	int sum=0;
	for (int i = 0; i < v.length; i++) {
		sum+=v[i];
	}
	System.out.println("total sum"+sum);
}
}
