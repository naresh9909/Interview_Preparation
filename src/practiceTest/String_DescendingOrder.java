package practiceTest;
import java.util.Collections;
import java.util.Arrays;

public class String_DescendingOrder{
public static void main(String[] args){
String str = "HEY HOW ARE YOU";
System.out.println("String: "+ str);
String descStr = "";
String[] strArray = str.split(" ");
//------------------------------------------------
Arrays.sort(strArray, Collections.reverseOrder());
System.out.println("Descending order: "+ Arrays.toString(strArray));
for(String s: strArray){
descStr+=s+" ";
}
System.out.println("Descending order: "+ descStr);
}
}