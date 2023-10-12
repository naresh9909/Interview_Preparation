package ArrayList_LinkedList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alInt = new ArrayList<>();
		alInt.add(1);
		alInt.add(2);
		alInt.add(3);
		System.out.println("0: "+alInt);
		alInt.add(1,11);
		System.out.println("1: "+alInt);
		alInt.set(1, 111);
		System.out.println("2: "+alInt);
	}

}
