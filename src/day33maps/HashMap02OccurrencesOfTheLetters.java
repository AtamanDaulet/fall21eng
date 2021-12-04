package day33maps;

import java.util.HashMap;

public class HashMap02OccurrencesOfTheLetters {
/*
 * 
	 	How to count the number of occurrences of the letters(alphabetical characters) in a sentence
		For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
		              y=2, e=7, ...
	 
 */
	public static void main(String[] args) {
		String str = "Java is easy. Type codes to learn java. To earn money learn java.";
		
		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		System.out.println(str); //javaiseasytypecodestolearnjavatoearnmoneylearnjava
		
		String[] letters = str.split("");
		
		HashMap<String, Integer> result = new HashMap<>();  
				
		for (String s : letters) {	
			Integer numberOfOccurences = result.getOrDefault(s, 0);
    		result.put(s, numberOfOccurences + 1);			 
		}
		
		System.out.println(result);//{a=10, c=1, d=1, e=7, i=1, j=3, l=2, m=1, n=4, o=4, p=1, r=3, s=3, t=3, v=3, y=3}

	}

}
