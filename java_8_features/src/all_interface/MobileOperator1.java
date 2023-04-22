package all_interface;

public interface MobileOperator1 {
public abstract void showOperator();
public abstract void support4g();
public default void support5g() {
	System.out.println("yet to be supported");
}
public static void operatorGuideline() {
	System.out.println("rules:customer should have aadhar card");
}
}
