package practiceTest;

import java.util.Arrays;
import java.util.List;
public class A2L_L2A{

public static void main(String[] args){
String greet = "Good Morning Everyone";
String[] array = greet.split(" ");
System.out.println("Array: "+Arrays.toString(array));
List<String> array2List = Arrays.asList(array);
System.out.println("Array2List: "+ array2List);

Object[] list2Array = array2List.toArray();
System.out.println("List2Array: "+Arrays.toString(list2Array));

System.out.println(list2Array.getClass().getSimpleName());
System.out.println(array2List.getClass().getSimpleName());
String[] Sarray = new String[list2Array.length];

for(int i=0; i< list2Array.length;i++) {
	Sarray[i]= String.valueOf(list2Array[i]);
}
System.out.println("SArray: "+Arrays.toString(Sarray));
System.out.println("Sarray: "+ Sarray.getClass().getSimpleName());
}
}