package InterfaceAndAbstract;

public class implementingInterface implements mathInterface{

	@Override
	public void sum(int a, int b) {
		System.out.println("Interface 'Sum' method with arguments :"+a+" + "+b+" : "+(a + b));
		
	}

	@Override
	public void sum1(int a, int b) {
		System.out.println("Interface 'Sum1' method with arguments :"+a+" + "+b+" : "+(a + b));
		
	}
	// @Override
	 public void print1() {
		 System.out.println("This pring is from implementeation class");
	 }

}
