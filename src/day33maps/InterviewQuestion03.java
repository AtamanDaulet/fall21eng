package day33maps;

public class InterviewQuestion03 {
	/*
 	Ask user to enter the number of lines of an inverted pyramid.
  	Type a program to create the inverted pyramid.
	For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																		  * * * * * * *
																		    * * * * *
																		      * * *
		                                                                        *
*/
	public static void main(String[] args) {
		int numOfRows = 5;
		
		for(int i=numOfRows; i>=1; i--) {
			
			for (int j = 0; j < numOfRows - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
