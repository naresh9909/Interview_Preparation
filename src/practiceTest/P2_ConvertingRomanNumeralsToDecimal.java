package practiceTest;

import java.util.HashMap;

public class P2_ConvertingRomanNumeralsToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given_RomanValue = "MDCCCIV";
		char[] chArray = given_RomanValue.toCharArray();
		int sum = 0;
		for (int i = 0; i < chArray.length; i++) {
			if (i + 1 < chArray.length) {
				if (roman(chArray[i]) >= roman(chArray[i + 1])) {
					sum = sum + roman(chArray[i]);
				} else {
					sum = sum + roman(chArray[i+1]) - roman(chArray[i]);
					i++;
				}

			} else if ((i + 1 == chArray.length)&&(roman(chArray[i-1]) == roman(chArray[i]))) {
				sum = sum + roman(chArray[i]);
			}
			System.out.println("i: " + i + "    " + sum);
		}
		System.out.println("Roman value: " + given_RomanValue);
		System.out.println("Converted value: " + sum);

	}

	public static int roman(char ch) {
		HashMap<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);
		return romanValues.get(ch);
	}

}
