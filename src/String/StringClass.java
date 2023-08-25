package String;

import java.util.Arrays;

public class StringClass {
	public static void main(String Args[]) {
		
		// Converting String to Char Array --> Char Array to String
		String great = "Hello, welcome to JAVA";
		System.out.println(great);
		char[] charArray = great.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		String greatChar = new String(charArray);
		System.out.println(greatChar);
		
		//Split the words and display words in reverse
		String[] sp = great.split(" ");
		System.out.println(Arrays.toString(sp));
		String rev = "";
		for(int i=sp.length-1; i>=0;i--) {
			rev+=sp[i]+" ";
		}
		System.out.println(rev);
		
		//.equalIgnoreCase
		String a = "HELLO";
		String b = "Hello";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		//charAt
		System.out.println(a.charAt(1));
		
		// matches with RegEx
		System.out.println(a.matches("(.*)"));
		System.out.println(a.matches("^H(.*)O$"));
		System.out.println(a.matches("^E(.*)O$"));
		
		//Substring(beginIndex) or substring(beginIndex, endIndex)
		System.out.println();
		System.out.println(a.substring(1));
		System.out.println(a.substring(1, 4));
		
		//contains
		System.out.println(a.contains("E"));
		System.out.println(a.contains("Z"));
		
		//concat
		System.out.println(a.concat(" NARESH"));
		
		//indexOf(char/string) lastIndexOf(char/String)
		System.out.println(a.indexOf("L"));
		System.out.println(a.lastIndexOf("L"));
		System.out.println(a.indexOf("LLO"));
		System.out.println(a.indexOf("LO", 1));
		System.out.println(a.indexOf("L", 2));
		
		//valueOf(int) converting int to String
		System.out.println(String.valueOf(2).toCharArray());
		
		//toLowwercase() toUppercase()
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		
		//startsWith() endsWith()
		System.out.println(a.startsWith("HE"));
		System.out.println(a.endsWith("LO"));
		System.out.println(a.startsWith("He"));
		System.out.println(a.endsWith("Lo"));
		
		//Converting Sting to Integer
		String num = "99";
		int number1 = Integer.parseInt(num);
		System.out.println(a.startsWith("HE"));
		System.out.println(number1+1);
	}

}
