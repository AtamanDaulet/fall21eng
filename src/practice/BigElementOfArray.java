package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class BigElementOfArray {

	/*
    Please find the biggest element in the given array
      */
	public static void main(String[] args) {
		 int [] array = {1,24,2,342,123,543,54,3,2};
		 // 1 way
		 int result = maxNum(array);
		 System.out.println(result);
		 
		 //2 way
		 Arrays.sort(array);
		 System.out.println(array[array.length-1]);
		 
		//3 way
		 int[] x = IntStream.of(array).boxed().sorted(Comparator.reverseOrder())
				 .mapToInt(t -> t).toArray();	
		 System.out.println(x[0]);
	}

	private static int maxNum(int[] array) {
		
		int max = Integer.MIN_VALUE;
		 
		 for (int i : array) {
			if(max < i) max =i;
		}
		 return max;
	}

}
