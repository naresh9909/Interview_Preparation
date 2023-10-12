package practiceTest;

import java.util.Arrays;

public class String_AscendingOrder{
public static void main(String[] args){
String str = "HEY HOW ARE YOU";
System.out.println("String: "+ str);
String ascStr = "";
String[] strArray = str.split(" ");

Arrays.sort(strArray);
System.out.println(Arrays.toString(strArray));
for(String s: strArray){
ascStr+=s+" ";
}
System.out.println("Ascending order: "+ ascStr);
}
}