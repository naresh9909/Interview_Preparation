

import java.util.Comparator;

import modifiersClass.protectedClass;
import modifiersClass.publicClass;



public  class OutSideRunnerClass extends protectedClass{

	public static void main(String[] args) {
		publicClass pbc = new publicClass();
		//privateClass pvc = new privateClass();
		//DefaultClass dfc = new DefaultClass();
		//protectedClass prc = new protectedClass();
		
		System.out.println(pbc.name);
		//System.out.println(pvc.name);
		//pvc.setName("ST");
		//System.out.println(pvc.getName());
		//System.out.println(dfc.name);
		System.out.println(name);
		
		pbc.hello();
		hello();
		

	}

}
