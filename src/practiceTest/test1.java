package practiceTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test1{
public static void main(String[] arg){

String str = "Hello";
System.out.println("Length of the String: "+ str.length());
String reverseString = "";
for(int i=0;i<str.length();i++){
	int index = str.length()-1-i;
	System.out.println(index);
	System.out.println(str.charAt(index));
reverseString+=str.charAt(index);
}
System.out.println("Reversed String: "+reverseString);

String[] strArray = str.split("");
System.out.println(Arrays.toString(strArray));
Collections.reverse(Arrays.asList(strArray));
System.out.println(Arrays.toString(strArray));

String revString = "";
for(String s: strArray) {
	revString+=s;
}
System.out.println(revString);


}
}