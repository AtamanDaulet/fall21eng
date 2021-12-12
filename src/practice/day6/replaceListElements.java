package practice.day6;

import java.util.ArrayList;
import java.util.Collections;

public class replaceListElements {

	public static void main(String[] args) {
		
			//replace the elements that has value 1 to 8
		      ArrayList<Integer> list = new ArrayList<Integer>();
		      list.add(1);
		      list.add(2);
		      list.add(7);
		      list.add(1);
		      
		      list.add(3);
		      list.add(1);
		      
		     Collections.replaceAll(list, 1, 8);
		     System.out.println(list);
	}

}
