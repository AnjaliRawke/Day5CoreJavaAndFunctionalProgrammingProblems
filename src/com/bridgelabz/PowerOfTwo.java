package com.bridgelabz;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		int powerOfTwo = 1;

		// repeat until i equals n
		while (i <= n) {
			System.out.println(i + " " + powerOfTwo);// double to get the next one
			powerOfTwo = 2 * powerOfTwo;
			i++;
		}
	}
}
