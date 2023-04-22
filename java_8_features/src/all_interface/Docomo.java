package all_interface;

public class Docomo implements MobileOperator1{

	@Override
	public void showOperator() {
		System.out.println("docomo");
	}

	@Override
	public void support4g() {
		System.out.println("support 4g");
	}
   public void support5g() {
	   System.out.println("support 5g");
   }
}
