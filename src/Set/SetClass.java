package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		/*
		 * city.add(element)
		 * places.addAll(city) --> places will be cloned with city 
		 * places.clear()
		 * city.contains("Nellore")
		 * city.isEmpty()
		 * city.remove("SFO")
		 * city.remove(places)
		 * city.size()
		 * city.toArray() --> it'll create an object array
		 */
		
		Set<String> city = new HashSet<String>();
		Set<String> places = new HashSet<String>();
		
		//Adding elements
		city.add("Nellore");
		city.add("Denver");
		city.add("SFO");
		city.add("Parker");
		city.add("Colorado Springs");
		city.add("Littleton");
		
		System.out.println(city);
		
		//addAll
		places.addAll(city);
		System.out.println(places);
		
		//.clear
		places.clear();
		System.out.println(places);
		
		//.contains
		System.out.println(city.contains("Nellore"));
		System.out.println(city.contains("Texas"));
		
		//.contains
		System.out.println(city.isEmpty());
		System.out.println(places.isEmpty());
		
		//.remove
		city.remove("SFO");
		System.out.println(city);
		
		//.removeAll
		places.addAll(city);
		places.add("SFO");
		System.out.println(places);
		System.out.println(city);
		places.removeAll(city);
		System.out.println(places);
		
		//.size()
		System.out.println(city.size());
		
		//toArray()
		System.out.println(Arrays.toString(city.toArray()));

	}

}
