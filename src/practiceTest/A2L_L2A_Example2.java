package practiceTest;

import java.util.Arrays;
import java.util.List;
public class A2L_L2A_Example2{

public static void main(String[] args){
Integer[] intArray = {1,11,2,22,3,33,4,44,5,55};
System.out.println("Array: "+Arrays.toString(intArray));
List<Integer> array2List = Arrays.asList(intArray);
System.out.println("Array2List: "+ array2List);

Object[] list2Array = array2List.toArray();
System.out.println("List2Array: "+Arrays.toString(list2Array));

System.out.println(list2Array.getClass().getSimpleName());
System.out.println(array2List.getClass().getSimpleName());
}
}