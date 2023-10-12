package ArrayList_LinkedList;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * AL.add(1) 
		 * AL.add(3, 1111) 
		 * AL.clear() 
		 * AL.addAll(AL1) 
		 * AL.addAll(1,AL1) --> It'll insert the AL1 in the 1st index
		 * AL2.set(7, 111) --> It'll update the value in the given index
		 * AL.contains(1111) --> true
		 * AL.remove(index)
		 * AL.remove(value)
		 * AL.removeAll(AL1) --> It'll remove all values in AL1 from AL
		 * AL.toArray() --> It'll return Object[]
		 * AL.subList(beginIndex, endIndex) --> to create a sublist
		 */

		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(1);
		AL.add(11);
		AL.add(111);
		AL.add(2);
		AL.add(22);
		AL.add(222);
		AL.add(3);
		AL.add(33);
		AL.add(333);
		// AL.add(Index, value)
		AL.add(3, 1111);
		System.out.println(AL);

		// AL.clone()
		ArrayList<Integer> AL1 = (ArrayList<Integer>) AL.clone();
		System.out.println(AL1);

		// Sorting and reverse using Collections
		Collections.sort(AL1);
		System.out.println(AL1);

		Collections.reverse(AL1);
		System.out.println(AL1);

		// AL.clear()
		AL.clear();
		System.out.println(AL);

		// AL.addAll(AL1)
		AL.addAll(AL1);
		System.out.println(AL);

		// AL.addAll(AL1)
		AL.addAll(1,AL1);
		System.out.println(AL);

		// AL.contain(value)
		System.out.println(AL.contains(1111));
		System.out.println(AL.contains(2222));
		
		//AL.get(1)
		System.out.println(AL.get(1));
		
		//AL.indexOf(), AL.lastIndexOf()
		System.out.println(AL.indexOf(333));
		System.out.println(AL.lastIndexOf(333));
		
		//
		AL.remove(AL.size()-1);
		System.out.println(AL);
		AL.remove(2);
		System.out.println(AL);
		AL.removeAll(AL1);
		System.out.println(AL);
		AL.addAll(AL1);
		System.out.println(AL);
		AL.removeIf(e->e<50);
		System.out.println(AL);
		
		//AL.toArray() ---> This will return OBJECT array
		Object[] INTARR = AL1.toArray();
		System.out.println("ARRAY: "+ Arrays.toString(INTARR) );
		
		//SubList
		System.out.println(AL1);
		List<Integer> AL2 = AL1.subList(1, 7);
		System.out.println(AL2);
		
		//AL2.set(5, 111)
		AL2.set(5, 111);
		System.out.println(AL2);
		

	}

}
