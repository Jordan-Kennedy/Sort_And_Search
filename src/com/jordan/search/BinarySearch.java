package com.jordan.search;

import java.util.Scanner;

public class BinarySearch {

	static Scanner scan = new Scanner(System.in);
	
	static int[] dataArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static int dataArrayLength = dataArray.length;
	
	static int lowerBound = 0;
	static int upperBound = dataArrayLength - 1;
	
	static boolean found = false;
	static int midPoint;
	static int searchIterations = 0;
	
	static int searchTerm;
	
	public static void main(String[] args) {
		System.out.println("Java binary search");
		System.out.println("------------------");

		System.out.println("Which item do you wish to search for?");
		searchTerm = scan.nextInt();
		
		while (found == false && lowerBound<=upperBound) {
			midPoint = ((upperBound + lowerBound ) / 2);
			
			if (dataArray[midPoint] == searchTerm) {
				found = true;
				break;
			}
			else if (dataArray[midPoint] < searchTerm ) {
				lowerBound = midPoint + 1;
			}
			else if (dataArray[midPoint] > searchTerm ) {
				upperBound = midPoint - 1;
			}
			++searchIterations;
		}
		
		if (found == true ) {
			System.out.println("Your item has been found, it was positioned at the " + midPoint + " entry.");
			System.out.println("Your item was found in " + searchIterations + " iterations.");
		} else {
			System.out.println("Your item couldn't be found within the list");
		}
	}
}
