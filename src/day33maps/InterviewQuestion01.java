package day33maps;

import java.util.Scanner;

public class InterviewQuestion01 {

	public static void main(String[] args) {
		/*
		 * Get a String and a character from user
	 	Count the number of characters between the first occurrence and the last occurrence 
	 	of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; “Java is easy” - ‘a’ ==> 5
	 	             “Java is easy” - ‘w’ ==> -1
	 	             “Java is easy” - ‘e’ ==> -1
		 */
		String str = "Java is easy";
		str = str.replaceAll("\\s", "");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type one of a char from string = Java is easy :");
		String ch = scan.next();
		
		if(str.indexOf(ch) == str.lastIndexOf(ch)) {
			System.out.println(-1);
		}
		
		if(str.indexOf(ch) != str.lastIndexOf(ch)) {

			int first = str.indexOf(ch);
			int last = str.lastIndexOf(ch);
			System.out.println(first + " "+last);
			System.out.println(last - first-1);
	
		}
		
		scan.close();
		
		
		
		

	}

}
