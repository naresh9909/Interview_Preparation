package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class pc1 {

	public static void main(String args[]) {
		String str = "KPI is KEY performance Index, but We've to Keep People Informed";
		char charAt = str.charAt(7);
		System.out.println(charAt);
		String str2 = str.concat(" and Keep People involved");
		System.out.println(str2);

		String[] st1 = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX", "YZ" };
		System.out.println("The length of st1 array is: " + st1.length);
		String[] st2 = st1.clone();
		System.out.println("Cloned array st2: " + Arrays.toString(st2));
		System.out.println(String.valueOf(st2) + " " + String.valueOf(st2).getClass().getSimpleName());

		String[] st3 = Arrays.copyOf(st1, 4);
		System.out.println("Arrays.copyOf(st1,4): " + Arrays.toString(st3));

		String[] st4 = Arrays.copyOfRange(st1, 1, 4);
		System.out.println("Arrays.copyOfRange(st1,1,4): " + Arrays.toString(st4));
		
		Arrays.sort(st4, Collections.reverseOrder());
		System.out.println("Arrays.sort(st4, Collections.reverseOrder()): " + Arrays.toString(st4));

		String apple = "APPLE";
		char[] chArray = apple.toCharArray();
		System.out.println("apple.toCharArray(): " + Arrays.toString(chArray));
		System.out.println(chArray.getClass().getSimpleName());

		String chArray2String = String.valueOf(chArray);
		System.out.println("String.valueOf(chArray): " + chArray2String);
		System.out.println(chArray2String.getClass().getSimpleName());

		String array2String = Arrays.toString(st2);
		System.out.println("array2String: " + array2String);
		System.out.println("array2String length: " + array2String.length());
		for (int i = 0; i < array2String.length(); i++) {
			System.out.println(i + ": " + array2String.charAt(i));

		}

		List<String> al = new ArrayList<>();
		al.add("ONE");
		al.add("TWO");
		al.add("THREE");
		al.add("FOUR");
		al.add("FIVE");
		al.add("SIX");
		al.add("SEVEN");
		al.add("EIGHT");
		al.add("NINE");
		al.add("TEN");
		System.out.println("al: " + al);
		Collections.reverse(al);
		System.out.println("al reverse: " + al);
		Collections.sort(al);
		System.out.println("al sort: " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("al reverseOrder: " + al);
	}

}