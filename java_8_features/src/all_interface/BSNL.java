package all_interface;

public class BSNL implements MobileOperator1{

	@Override
	public void showOperator() {
		System.out.println("bsnl");
	}

	@Override
	public void support4g() {
		System.out.println("support 4g");
	}

}
