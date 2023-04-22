package all_interface;

public class MobileDemo {
public static void main(String[] args) {
	MobileOperator1 bsnl=getBSNL();
	
	MobileOperator1 docomo=getDocomo();
	MobileOperator1.operatorGuideline();
	bsnl.showOperator();
	bsnl.support4g();
	bsnl.support5g();
	docomo.showOperator();
	docomo.support4g();
	docomo.support5g();
}

private static MobileOperator1 getDocomo() {
	return new Docomo();
}

private static MobileOperator1 getBSNL() {
	
	return new BSNL();
}
}
