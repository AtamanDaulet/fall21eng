package practice.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertElementsByIndex {

	public static void main(String[] args) {
		 //Add these fruits to their given indexes in a list
		 //The ArrayList elements are: [Apple, Melon, Mango, Grape, Banana]
		
		List list = new ArrayList<>();
		
		list.add(0, "Apple"); //[Apple,Melon, Mango,Grape, Banana,   ]
		list.add(1, "Mango");
		list.add(2, "Banana");
		list.add(1,"Melon");
		list.add(3,"Grape");
		
		
		System.out.println(list);
	}

}
