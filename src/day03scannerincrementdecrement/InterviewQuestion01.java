package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQuestion01 {
	 /*
 	Get 2 numbers from user then swap the numbers
 	User ==> a=2 and b=5 the a=5 and b=2
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//1 way
		System.out.println("Enter the first integer...");
		int first = scan.nextInt();
		
		System.out.println("Enter the second integer...");
		int second = scan.nextInt();
		
		System.out.println("Before swap: " + first + " - " + second);
		/*
		int temporary = 0;
		
		temporary = first;
		
		first = second;
		
		second = temporary;
		
		System.out.println("After swap: " + first + " - " + second + " - " + temporary);
		*/
		// 2 way
		//////////////////////////
		/*
		System.out.println("Enter first integer, please:");
		int firstNum = scan.nextInt();
		System.out.println("Enter second integer, please:");
		int secondNum = scan.nextInt();
		
		System.out.println("first = " +firstNum + ", second = " +secondNum);
		
		int sum = firstNum+secondNum;
		
		secondNum = sum - secondNum;
		firstNum = sum - secondNum;
		
		System.out.println("After");
		System.out.println("first = " +firstNum + ", second = " +secondNum);
		*/
		// 2.1 way		
		//2.Way: Without using 3rd container...
				first = first + second;		
				second = first - second;		
				first = first - second;		
				System.out.println("After swap: " + first + " - " + second);
				
				scan.close();
	}

}
