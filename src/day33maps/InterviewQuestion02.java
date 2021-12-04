package day33maps;

import java.util.Scanner;

public class InterviewQuestion02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the number of lines of a pyramide.
	  	Type a program to create the pyramide.
	  	For example if the number of lines is 5, the pyramide will be like;         *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the number of lines of a pyramide");
//		int number = scan.nextInt();
		
		int number =5;
		
		for (int i = 1; i <= number; i++) {
			
			for (int space = number - i; space >= 0; space--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
