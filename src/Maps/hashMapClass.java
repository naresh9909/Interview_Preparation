package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * hm.put(key, value)
		 * hm.containsKey(key)
		 * hm.containsValue(value)
		 * hm.keySet()
		 * hm.value()
		 * hmCopy.putAll(hm)
		 * hm.equals(hmCopy)
		 * hm.size()
		 * hm.putIfAbsent(key,value)
		 * hm.clear()
		 * hm.isEmpty()
		 */
		
		Map<Integer, String> hm = new HashMap<>();
		Map<Integer, String> hmCopy = new HashMap<>();
		Map<String, String> hmSS = new HashMap<>();
		hm.put(5, "FIVE");
		hm.put(3, "THREE");
		hm.put(4,  "FOUR");
		hm.put(1, "ONE");
		hm.put(2,"TWO");
		
		hmSS.put("TWO","TWOTWO");
		hmSS.put("FOUR","FOURFOUR");
		hmSS.put("FIVE","FIVEFIVE");	
		hmSS.put("ONE","ONEONE");
		hmSS.put("THREE","THREETHEE");

		
		System.out.println(hm);
		
		//hm.containsKey(key), hm.containsValue(value)
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(11));
		System.out.println(hm.containsValue("ONE"));
		System.out.println(hm.containsValue("HELLO"));
		
		//hm.keySet(), hm.value()
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//hm1.putAll(hm)
		hmCopy.putAll(hm);
		System.out.println(hmCopy);
		
		//hmCopy.equls(hm)
		System.out.println(hm.equals(hmCopy));
		
		//hm.size()
		System.out.println(hm.size());
		
		//hm.putIfAbsent(key,value)
		hm.putIfAbsent(5,"UPDATED_FIVE");
		hm.putIfAbsent(6, "UPDATED_SIX");
		System.out.println(hm);
		
		//hm.remove(key)
		System.out.println(hm.equals(hmCopy));
		hm.remove(6);
		System.out.println(hm);
		System.out.println(hm.equals(hmCopy));
		
		//hm.clear() hm.isEmpty()
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());
		
		hm.put(null, "Hello");
		System.out.println(hmCopy);
		
		Iterator<Entry<Integer, String>> hmIT = hmCopy.entrySet().iterator();
		while(hmIT.hasNext()) {
			Entry<Integer,String> pair = hmIT.next();
			System.out.print(pair.getKey()+" : ");
			System.out.println(pair.getValue());
		}
		
		System.out.println(hmSS);
		System.out.println(hmSS);
		System.out.println(hmSS);
		System.out.println(hmSS);
		System.out.println(hmSS);
	}

}
