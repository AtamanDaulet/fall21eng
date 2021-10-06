package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperator01 {
/*
 * Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width, 
and the sum of the two numbers will be the length of a rectangle. 
Then calculate the area and the perimeter of the rectangle, and print them 
on the console.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two integer values, the first will be greater than the second., please:");
		
		int firstBig = scan.nextInt();
		int secondSmall = scan.nextInt();

		int width = firstBig % secondSmall;
		System.out.println(width);
		
		int length = firstBig + secondSmall;
		System.out.println(length);
		
		System.out.println("the area : " + width*length);
		System.out.println("the perimeter of the rectangle : " +2*(width+length));
		
		scan.close();
	}

}
