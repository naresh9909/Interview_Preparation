package ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	public static void main(String[] Args) {
		
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
		
		ArrayList<Integer> AL1 = (ArrayList<Integer>) AL.clone();
	}

}
