package practiceTest;
import java.util.Arrays;
public class ArrayPractice{
public static void main(String[] args){

String[] str = {"JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DEC"};
int[] in = new int[5];
in[0] = 1;
in[1] = 11;
in[2] = 2;
in[3] = 22;
in[4] = 3;

//clone
String[] str1 = str.clone();
int[] in2 = in.clone();
System.out.println("str array length: "+Arrays.toString(str1));
System.out.println("int array length: "+Arrays.toString(in2));

//length
System.out.println("str array length: "+str.length);
System.out.println("int array length: "+in.length);

//copyOf

String[] str3 = Arrays.copyOf(str, 15);
String[] str4 = Arrays.copyOfRange(str, 1, 10);
System.out.println("Arrays.equals(str, str1  :"+Arrays.equals(str, str1));
System.out.println("Str3  :"+Arrays.toString(str3));
System.out.println("Str4  :"+Arrays.toString(str4));
System.out.println(str[10]);

Arrays.fill(str3, "PlaceHolder");
System.out.println("Str3  :"+Arrays.toString(str3));
}



}