package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner02 {
/*
 * Type a program which calculates the area and the perimeter of a rectangle 
whose length and with are entered by user. 
Hint 1: Area of a rectangle is width x length
Hint 2: Perimeter of a rectangle is 2x (width + length)
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length, please:");
		double sideLength = scan.nextDouble();
		System.out.println("Enter width, please:");
		double sideWidth = scan.nextDouble();
		
		System.out.println("Area of a square is: "+ (sideLength * sideWidth));
		System.out.println("Perimeter of a square is :" + (2*(sideLength * sideWidth)));

	}

}
