package day17foreachloopmultidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		//Print the elements which have "a" from a 2 dimensional String array
        
        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        for(String[] w : arr1) {
            for(String x : w) {
                if(x.contains("a")) {
                    System.out.print(x + " ");
                }               
            }       
        }
        
        //Convert a 2 dimensional array to 1 dimensional array
        int arr2[][] = { {1,2}, {3,4,5}, {6, 7, 9, 10} };
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        String arr2String = Arrays.deepToString(arr2).replaceAll("\\p{Punct}", "");
        System.out.println(arr2String);
        System.out.println("String length():"+arr2String.replaceAll(" ", "").length());
        
        String[] arr1Splited = arr2String.split(" ");
        
        int[] arr1dim = new int[arr1Splited.length];
        
        System.out.println(Arrays.toString(arr1Splited));
        System.out.println("Arrays length():"+arr1Splited.length);
        System.out.println(Arrays.toString(arr1dim));
        
        for (int i = 0; i < arr1Splited.length; i++) {
        	arr1dim[i] = Integer.valueOf(arr1Splited[i]);
		}
        System.out.println(Arrays.toString(arr1dim));
	}

}
