package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		/*
		 * Type a program which calculates the area and the perimeter of a square 
	whose side length is entered by user. 
	Hint 1: Area of a square is length x length
	Hint 2: Perimeter of a square is 4x length
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length, please:");
		double sideLength = scan.nextDouble();
		
		System.out.println("Area of a square is: "+ (sideLength * 2));
		System.out.println("Perimeter of a square is :" + (sideLength * 4));
		
		
	}

}
