package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner02 {
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter 1 number:");
		Double firstNum = scan.nextDouble();
		
		System.out.println("Enter 2 number:");
		Double secondNum = scan.nextDouble();
		
		System.out.println("Sum: " + (firstNum + secondNum));
	}
}
