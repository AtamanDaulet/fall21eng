package day10loops;

import java.util.Scanner;

public class WhileLoop06 {
	//Get String from user and print just vowels(aeiou) inside String on the console
	public static void main(String[] args) {
		//My way  ****************
		String str = "afjcvnu3543ddfrh mn,vhkuiuytb";
		String vowels = "aeiou";
		for (int i = 0; i < str.length(); i++) {
			
			if(vowels.indexOf(str.charAt(i)) != -1 ) {
				System.out.print(str.charAt(i));
				
			}
		}
		
		System.out.println();
		
		str = str.replaceAll("[^aeiou]", "");
		System.out.println(str);
		//**************************	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scan.nextLine();
		
		//1.Way:
		int idx = 0;
		while(idx<s.length()) {
			
			char c = s.charAt(idx);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				
				System.out.print(c);
			}
						
			idx++;
		}
		
		System.out.println();
		
		//2.Way:		
		String s1 = s.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(s1);
		
		scan.close();

	}
}
