package practiceTest;
import java.util.Arrays;
import java.util.Collections;
public class StringOperationsPractice{

public static void main(String[] args){
String str = "HOPE FOR THE BEST";

//display the string length
System.out.println("String lenght: "+str.length());

//reverse the string using String
String[] str1 = str.split("");
System.out.println(Arrays.toString(str1));
String temp = "";
for(int i=str1.length-1;i>=0;i--) {
	temp+=str1[i];
}
System.out.println("Reverse String: "+temp);

//reverse the StringBuffer
StringBuffer sb = new StringBuffer(str);
System.out.println("String Buffer: "+sb);
sb.reverse();
System.out.println("String Buffer: "+sb);

//Split the string into words using space as " " delimiter
String[] strSplit = str.split(" ");
System.out.println(Arrays.toString(strSplit));

//Descending order the String Arrays
Arrays.sort(strSplit, Collections.reverseOrder());
System.out.println("Descending Order: "+Arrays.toString(strSplit));
Arrays.sort(strSplit);
System.out.println("Ascending Order: "+Arrays.toString(strSplit));

//indexOf, lastIndexOf
String s1 = str.substring(str.indexOf("FOR"),str.indexOf("BEST")-1);
System.out.println(s1);

//String toLowercase(), toUppercase()
String sl = str.toLowerCase();
String su = str.toUpperCase();
System.out.println(sl+" "+su);

//startWith, endsWith
System.out.println(str.startsWith("HO"));
System.out.println(str.startsWith("Ho"));
System.out.println(str.endsWith("ST"));

}

}