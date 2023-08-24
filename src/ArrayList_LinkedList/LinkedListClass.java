package ArrayList_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * All examples in the ArrayList applies to LinkedList
		 * ArrayList are fast to search, but insertion and deletion is slow
		 * LinkedList search is slow, but insertion and deletion are fast
		 * addFirst(E e)	This method Inserts the specified element at the beginning of this list.
		 * addLast(E e)	This method Appends the specified element to the end of this list.
		 * descendingIterator()	This method returns an iterator over the elements in this deque in reverse sequential order.
		 * getFirst()	This method returns the first element in this list.
		 * getLast()	This method returns the last element in this list.
		 * removeFirst()	This method removes and returns the first element from this list.
		 * removeFirstOccurrence(Object o)	This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
		 * removeLast()	This method removes and returns the last element from this list.
		 * removeLastOccurrence(Object o)	This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
		 */
		
		LinkedList<String> numbers = new LinkedList<String>();
		numbers.add("TWO");
		numbers.add("THREE");
		numbers.add("FIVE");
		System.out.println(numbers);
		
		numbers.addFirst("ONE");
		numbers.addLast("SIX");
		System.out.println(numbers);
		
		numbers.getFirst();
		numbers.getLast();
		System.out.println(numbers);
		
		numbers.removeFirst();
		numbers.removeLast();
		System.out.println(numbers);
		
		
		numbers.addFirst("ONE");
		numbers.addLast("SIX");
		numbers.addFirst("SIX");
		numbers.addLast("ONE");
		System.out.println(numbers);
		
		numbers.removeFirstOccurrence("SIX");
		numbers.removeLastOccurrence("ONE");
		System.out.println(numbers);
		
		
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println("ASC: "+numbers);
		Collections.reverse(numbers);
		System.out.println("DESC: "+numbers);
	}

}
