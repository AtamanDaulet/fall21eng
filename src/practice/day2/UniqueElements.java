package practice.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {
	/*   create  a list by getting the list elements from user   
	 * if there is duplicated elements remove them from the list   
	 * ask user to stop if they are done with words as   
	 * Enter list elements, to stop entrance press '*'    */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> listEl = new ArrayList<>();
		
		String s="";
		do {
			s = "";
			boolean flag = true;
			
			System.out.println("Enter element or to stop enter * :");
			s = scan.nextLine();
		
			for (String str : listEl) {
				if(str.equalsIgnoreCase(s)) {
					flag = false;
				}
			}
			
			if (flag && !s.equals("*")) {
				listEl.add(s);
			}
			
			
		} while (!s.equalsIgnoreCase("*"));
		
		System.out.println(listEl);
		
		//2 way
		
		Set<String> uniqueSt = new HashSet<>(listEl);
		
		System.out.println(uniqueSt);
		
		
		
		
		
		scan.close();
	}

}
