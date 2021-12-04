package day31collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedHashSet01 {
	/*
 	1)If you need a collection to store unique elements in insertion order use LinkedHashSet
 */
	public static void main(String[] args) {
		
		LinkedHashSet <Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(12);
		lhs1.add(22);
		lhs1.add(10);
		lhs1.add(32);
		lhs1.add(5);

		System.out.println(lhs1);//[12, 23, 10, 32, 5]
		
		//Interview Question: Type code to display ArrayList elements just once
		//Ex: ArrayList: [5, 3, 5, 2, 5, 3] ==> [5, 3, 2]
		List<Integer> l1 = new LinkedList<>();
		
		l1.addAll(Arrays.asList(5,3,5,2,5,3));
		
		//LinkedHashSet <Integer> hs3 = new LinkedHashSet<>();	
		//hs3.addAll(l1);
		
		LinkedHashSet <Integer> lhs2 = new LinkedHashSet<>(l1);
		
		System.out.println(l1);
		System.out.println(lhs2);

	}

}
