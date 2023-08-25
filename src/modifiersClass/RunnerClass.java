package modifiersClass;

import java.util.Comparator;

public  class RunnerClass{

	public static void main(String[] args) {
		publicClass pbc = new publicClass();
		privateClass pvc = new privateClass();
		DefaultClass dfc = new DefaultClass();
		protectedClass prc = new protectedClass();
		
		System.out.println(pbc.name);
		//System.out.println(pvc.name);
		pvc.setName("ST");
System.out.println(pvc.getName());
		System.out.println(dfc.name);
		System.out.println(prc.name);
		
		pbc.hello();
		//pvc.hello()
		dfc.hello();
		prc.hello();
		

	}

}
