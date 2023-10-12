package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayFunctions {

	
	/*
	 * arrayName.clone();
	 * arrayName.length;
	 * Arrays.asList(arrayName);
	 * Arrays.copyOf(originalArray, NewLength)
	 * Arrays.copyOf(originalArray, FromIndex, EndIndex)
	 * Arrays.equals(array1, array2)
	 * Arrays.fil(array1,value)
	 * Arrays.prallelSort(arrayName)
	 * Arrays.sort(arrayName)
	 * Arrays.sort(arrayName, FromIndex, ToIndex) --> Ascending order
	 * Arrays.sort(intArrLIST, Collections.reverseOrder()); --> to print in Descending order
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intArrLIST[] = { 10, 20, 15, 22, 11, 35, 9 };
		int intArr[] = { 10, 20, 15, 22, 11, 35, 9 };
		int intArrPSort[] = { 10, 20, 15, 22, 11, 35, 9 };
		int intArrSort[] = { 10, 20, 15, 22, 11, 35, 9 };
		int intArrSortIndex[] = { 18, 20, 15, 17, 11, 35, 9 };
		
		//convert Array to List
		List<Integer> intList = new ArrayList<>();
		intList = Arrays.asList(intArrLIST);
		List<Integer> intL = List.of(10, 20, 15, 22, 11, 35, 9 );
		System.out.println(intList);
		System.out.println(intL);
		System.out.println(intList.equals(intL));
		
		// It'll return the index of given element --> "Index: 3
		System.out.println("Index: " + Arrays.binarySearch(intArr, 22));

		// copyOf(originalArray, NewLength)
		int intArr1[] = intArr.clone();
		System.out.println(Arrays.toString(intArr1));

		// copyOf(originalArray, NewLength)
		int intArr2[] = Arrays.copyOf(intArr, 4);
		System.out.println(Arrays.toString(intArr2));

		// copyOf(originalArray, NewLength) --> It'll create a new array
		int intArr3[] = Arrays.copyOf(intArr, 10);
		System.out.println(Arrays.toString(intArr3));

		// copyOfRange(originalArray, FromIndex, EndIndex) --> It'll create a new array
		int intArr4[] = Arrays.copyOfRange(intArr, 1, 3);
		System.out.println(Arrays.toString(intArr4));

		// equals --> Arrays.equals compares two arrays
		System.out.println(intArr.equals(intArr1));
		System.out.println(Arrays.equals(intArr, intArr1));

		// fill, it'll update the original array
		Arrays.fill(intArr, 22);
		System.out.println(Arrays.toString(intArr));

		// PrallelSort
		Arrays.parallelSort(intArrPSort);
		System.out.println(Arrays.toString(intArrPSort));

		// Sort
		Arrays.sort(intArrSort);
		System.out.println(Arrays.toString(intArrSort));

		// Sort
		System.out.println("Before sorting: "+ Arrays.toString(intArrSortIndex));
		Arrays.sort(intArrSortIndex, 1,4);
		System.out.println("Sort based on INDEX: "+ Arrays.toString(intArrSortIndex));
		
		// Sort in Descending order
		System.out.println("Before Descending order: "+ Arrays.toString(intArrLIST));
		Arrays.sort(intArrLIST);
		System.out.println("Ascending order: "+ Arrays.toString(intArrLIST));
		Arrays.sort(intArrLIST, Collections.reverseOrder());
		System.out.println("After reverse Order: "+ Arrays.toString(intArrLIST));
		
		// Convert Array to List using Arrays.asList()
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		List<String> carsList = List.of("Volvo", "BMW", "Ford", "Mazda");
		System.out.println(carsList.equals(Arrays.asList(cars)));
		
	}
	


}
