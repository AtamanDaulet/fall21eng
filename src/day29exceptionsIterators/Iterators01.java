package day29exceptionsIterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
	/***
	 *
	 * Iterator                                         	ListIterator
Can traverse elements present in 			|  Can traverse elements present in Collection both in forward and backward directions.
Collection only in the forward direction.	

Helps to traverse Map, List and Set.	    |  Can only traverse List and not the other two.

Indexes cannot be obtained by using Iterator.|	It has methods like nextIndex() and previousIndex() to obtain indexes of elements at any time while traversing List.
Cannot modify or replace elements present 	 |  We can modify or replace elements with the help of set(E e)
in Collection	
Cannot add elements and it throws 
ConcurrentModificationException.	         |  Can easily add elements to a collection at any time.
Certain methods of Iterator are next(), 
remove() and hasNext().	                     |  Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(E e).
	 
	 */

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();// I created an "ArrayList" object in "List" data type
		list1.add("Ali");
		list1.add("Can");
		list1.add("Ali Can");
		
		System.out.println(list1);//[Ali, Can, Ali Can]
		
		//By using loops we cannot update lists(collections)
		for(String w : list1) {			
			w = w + "££££";		
		}		
		System.out.println(list1);//[Ali, Can, Ali Can]
		
		//loops cannot update collections because of that Java created a new structure which "iterator", by using
		//iterator we can do update on collections		
		
		ListIterator list1Itr = list1.listIterator();
		
		while(list1Itr.hasNext()) {
			
			Object el = list1Itr.next();
			
			list1Itr.set(el + "££££");
			
		}
		
		System.out.println("333 "+list1);
		
		//How to remove all elements from list1 by using list iterator
		
		ListIterator list2Itr = list1.listIterator();		
		while(list2Itr.hasNext()) {
			
			list2Itr.next();
			
			list2Itr.remove();
			
		}	
		System.out.println("==> " + list1);
						
		//*********************************
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("B");
		
		//How to print the elements one by one in reverse order by using list iterator
		ListIterator itr1 = list2.listIterator();
		
		//To move pointer to the end type the following code
		while(itr1.hasNext()) {
			itr1.next();
		}				
		
		//Get the elements from the end
		while(itr1.hasPrevious()) {
			
			Object el = itr1.previous();
			
			System.out.print(el + " ");
		}
		
		//Add X, Y, Z to the end of the list2 by using iterator
		
		while(itr1.hasNext()) {
			itr1.next();
		}
		
		String[] arr = {"X", "Y", "Z"};
		
		for (String str : arr) {
			list2.add(str);
		}
		System.out.println();
		System.out.println("list2==> " + list2);
		
//-----------------------------
		List<String> list = new ArrayList<>();

		list.add("AB");

		list.add("CD");

		list.add("EF");

        ListIterator<String> it = list.listIterator();

        Collections.reverse(list);

        while(it.hasNext()) {

        	System.out.print(it.next() + " ");

        }  
        
        /**********************
         * 
         */
        List<Integer> list5 = new ArrayList<>();
		list5.add(22);
		list5.add(23);
		list5.add(24);

		ListIterator<Integer> it5 = list5.listIterator();

		while(it5.hasNext()) {

			it5.next();

		}
		while(it5.hasPrevious()) {
			Integer el = it5.previous();

			it5.set(el = el + 3);

			System.out.print(el + " ");
		}
        
	}

}
