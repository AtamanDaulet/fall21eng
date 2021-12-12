package practice.day6;

import java.util.HashMap;
import java.util.SortedMap;

public class SortKeySetsOfMap {

	public static void main(String[] args) {
		/*
		 * "a"  "One"
		 * "b"  "Two"
		 * "d"  "Four"
		 * "c"  "Three
		 * Sort the elements using Map
		 */
		//Polymorphism
		SortedMap map =(SortedMap) new  HashMap();
		map.put("a", "One");
		map.put("b", "Two");
		map.put("d", "Four");
		map.put("c", "Three");
		
		System.out.println(map);

	}

}
