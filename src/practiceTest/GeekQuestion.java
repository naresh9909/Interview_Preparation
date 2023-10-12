package practiceTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class GeekQuestion {

	public static void main(String[] args) {
		String str = "HelloCello";
		ArrayList<String> al = new ArrayList<String>();
		Map<Integer, String> map = new TreeMap<Integer, String>();
		for (int j = 0; j < str.length(); j++) {
			for (int k = j; k <=str.length(); k++) {
				String subString = str.substring(j, k);
				String abc = checkIfValid(subString);
				if (!abc.equals("")) {
					al.add(subString);
				}
			}
		}
		System.out.println(al);
		//Collections.sort(al, Comparator.comparingInt(String::length));
		//Collections.reverse(al);
		System.out.println(al);
		for(String s: al) {
			map.putIfAbsent(s.length(), s);
		}
		System.out.println(map);
		int key = Collections.max(map.keySet());
		System.out.println(map.get(key));


	}

	public static String checkIfValid(String str) {
		String[] sarray = str.split("");
		List<String> oarray = Arrays.asList(sarray);
		for (int i = 0; i < oarray.size(); i++) {
			int firstIndex = oarray.indexOf(oarray.get(i));
			int lastIndex = oarray.lastIndexOf(oarray.get(i));
			if (firstIndex != lastIndex) {
				return "";
			}
		}
		return str;
	}

}
