package practiceTest;

public class SubString{

public static void main(String args[]){
String great = "Hey How Are You";
System.out.println(great);
String subGreat = great.substring(great.indexOf("How"), 11);
System.out.println(subGreat);
String subGreat1 = great.substring(great.indexOf("How"), great.indexOf("e You"));
System.out.println(subGreat1);
}
}