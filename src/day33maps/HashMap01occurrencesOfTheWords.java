package day33maps;

import java.util.HashMap;

public class HashMap01occurrencesOfTheWords {

	public static void main(String[] args) {
		/* How to count the number of occurrences of the words in a sentence
	    For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
	    Java=3, is=1, easy=1, Type=1, ... , learn=2, ... */

		String str = "Java is easy. Type codes to learn java. To earn money learn java.";
		
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		
		System.out.println(str); //java is easy type codes to learn java to earn money learn java
		
		String[] strArray = str.split(" ");
		
		HashMap<String, Integer> result = new HashMap<>();  
				
		for (String s : strArray) {			
			
			Integer numOfOccurence = result.get(s);
			
			if(numOfOccurence == null) {
				result.put(s, 1);
			}else {
				result.put(s, ++numOfOccurence);
			}
			
			// 2 way
			/*
			 Integer numberOfOccurences = results.getOrDefault(s, 0);
    		results.put(w, numberOfOccurences + 1);
			 */
		}
		
		System.out.println(result); //{codes=1, java=3, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1}
		
	}

}
