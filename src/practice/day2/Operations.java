package practice.day2;

import java.util.Scanner;

public class Operations {
	/*    /     * ask user to enter 2 int numbers then ask user to enter which operator they     
	 *     * want to use if addition then print here is the sum of your operation 7 + 4=        
	 *  * 11 Test data: Addition Subtraction Division Multiplication         */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first int:");
		int f = scan.nextInt();
		
		System.out.println("Enter second int:");
		int s = scan.nextInt();
		
		System.out.println("Enter operation (+-/*):");
		String o = scan.next();
		
		switch (o) {
		case "+":
			System.out.println("Addition:"+(f+s));
			break;

		case "-":
			System.out.println("Subtraction:"+(f-s));				
			break;
		case "/":
			System.out.println("Division:"+(f/s));		
			break;
		case "*":
			System.out.println("Multiplication:"+(f*s));		
			break;
		default:
			break;
		}
		
		scan.close();
	}

}
