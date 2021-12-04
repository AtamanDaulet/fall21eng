package practice.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayPair {
	/*
	   from a given array find all pairs whose sum is a  given number
	   {4,6,5,-10,8,5,20}===>10
	    */
	public static void main(String[] args) {

		int[] arr = {4,6,5,-10,8,5,5,20};
		
		List<Integer> pairslist = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (10 == arr[i]+arr[j]) {
					pairslist.add(arr[i]);
					pairslist.add(arr[j]);
				}
			}
		}
		
		System.out.println(pairslist);
		

	}

}
