package practice;

import java.util.Arrays;

public class Fibonacci {
	/*
    Type a program that will print all Fibonacci Sequence on the console
    0, 1, 1, 2, 3, 5, 8 etc..
     */
	public static void main(String[] args) {
		int n = 6;
		int[] sequence =fibonacciSeq(n);
		System.out.println(Arrays.toString(sequence));
		
	}

	private static int[] fibonacciSeq(int n) {
		int first = 0;
		int second = 1;
		int[] sequence = new int[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = first;
			int temp = first + second;
			first = second;
			second = temp ;
		}
		return sequence;
	}

}
