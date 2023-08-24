package InterfaceAndAbstract;

public class callingNormalClassUsingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		normalClass nc = new normalClass();
		int s = nc.sum(2, 3);
		int p = nc.product(2, 3);
		System.out.println("Sum: "+s+ "    Product: "+p);
		
		callingAbstractClass cAC = new callingAbstractClass();
		int s1 = cAC.sum(2, 3);
		System.out.println(s1);
		
		System.out.println("----------- INTERFACE ------------------");
		implementingInterface imINTER = new implementingInterface();
		imINTER.sum(2, 3);
		imINTER.sum1(2, 3);
		imINTER.print();

	}

}
