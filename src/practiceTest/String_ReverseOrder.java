package practiceTest;
import java.util.Collections;
import java.util.Arrays;

public class String_ReverseOrder{
public static void main(String[] args){
String str = "HEY HOW ARE YOU";
System.out.println("String: "+ str);
String revStr = "";
String[] strArray = str.split(" ");

//------------------------------------------------
Collections.reverse(Arrays.asList(strArray));
System.out.println(Arrays.toString(strArray));
for(String s: strArray){
revStr+=s+" ";
}
System.out.println("Reverse String: "+ revStr);

}

}