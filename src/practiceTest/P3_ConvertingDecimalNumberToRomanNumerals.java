package practiceTest;

import java.util.HashMap;

public class P3_ConvertingDecimalNumberToRomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 99;
		String y = String.valueOf(x);
		System.out.println(y + "    " + y.getClass().getSimpleName());
		String rv = "";
		for (int i = 0; i < y.length(); i++) {
			System.out.println(y.length() - i);
			System.out.println(y.charAt(y.length() - i - 1));
			rv = positionRomanValue(i+1, y.charAt(y.length() - i - 1))+rv ;
			System.out.println(rv);
		}

	}

	public static String positionRomanValue(int position, int value) {
		String romanValue = "";
		switch (position) {
		case 1:
		case '1':
			romanValue = getRomanValue(value, "I", "V", "X");
			break;
		case 2:
		case '2':
			romanValue = getRomanValue(value, "X", "L", "C");
			break;
		case 3:
		case '3':
			romanValue = getRomanValue(value, "C", "D", "M");
			break;
		case 4:
		case '4':
			romanValue = getRomanValue(value, "M", "W", "Y");
			break;
		default:
			System.out.println("Invalid \"position\"");
		}
		return romanValue;
	}

	public static String getRomanValue(int value, String i, String v, String x) {
		switch (value) {
		case 1:
		case '1':
			System.out.println(i);
			return i;
		case 2:
		case '2':
			System.out.println(i + i);
			return i + i;
		case 3:
		case '3':
			System.out.println(i + i + i);
			return i + i + i;
		case 4:
		case '4':
			System.out.println(i + v);
			return i + v;
		case 5:
		case '5':
			System.out.println(v);
			return v;
		case 6:
		case '6':
			System.out.println(v + i);
			return v + i;
		case 7:
		case '7':
			System.out.println(v + i + i);
			return v + i + i;
		case 8:
		case '8':
			System.out.println(v + i + i + i);
			return v + i + i + i;
		case 9:
		case '9':
			System.out.println(i + x);
			return i + x;
		default:
			System.out.println("Default flow...");
			return "";
		}
	}

}
