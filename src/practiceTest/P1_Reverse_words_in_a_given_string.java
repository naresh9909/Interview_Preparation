package practiceTest;

import org.testng.Assert;

public class P1_Reverse_words_in_a_given_string {

	public static void main(String[] args) {
		String given_str = "geeks quiz practice code";
		String expected_str = "code practice quiz geeks1";

		String[] splitArray = given_str.split(" ");
		String reverseStr = "";
		for (int i = splitArray.length - 1; i >= 0; i--) {
			if (i == splitArray.length - 1) {
				reverseStr = splitArray[i];
			} else {
				reverseStr = reverseStr + " " + splitArray[i];
			}
		}
		System.out.println("reverseStr:   "+reverseStr);
		System.out.println("expected_str: "+expected_str);
		Assert.assertEquals(expected_str,reverseStr);
	}

}
