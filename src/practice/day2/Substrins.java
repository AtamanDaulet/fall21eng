package practice.day2;

import java.util.Scanner;

public class Substrins {
	//1.Ask user to enter a word. If the word has odd number of characters //lenth() of characters
			//and has 3 or more characters, print the character in the middle of the word.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word:");
		String input = scan.next();
		System.out.println(input);
		
		if(input.length() % 2 == 1 && input.length() > 2) {
						
			int middle  = input.length()/2;
			
			System.out.println("Word is odd. Length is more 3.  Middle char:");
			System.out.println(input.substring(middle, middle+1));		
			
		}else {
			System.out.println("Word is even:"+input);		
		}
		
		scan.close();
	}
}
