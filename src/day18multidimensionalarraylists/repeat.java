package day18multidimensionalarraylists;

import java.util.Arrays;

public class repeat {

	public static void main(String[] args) {
		int arr[][] = { {1,2}, {-35,4,5}, {6, 7, 9, 10} };
		
		int elemcount = 0;
		int i = 0;
		for (int[] inner : arr) {
			elemcount += inner.length;
		}
		
		int arr1[] = new int[elemcount];
		
		for (int[] x : arr) {
			for (int j : x) {
				arr1[i++] = j;
			}			
		}
		
		System.out.println(Arrays.toString(arr1));
		int min = Integer.MAX_VALUE;
		
		for (int j : arr1) {
			if(min > j ) {
				min = j;
			}
		}
		
		System.out.println("Min value:" + min);
	}
}
