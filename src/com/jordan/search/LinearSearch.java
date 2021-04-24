package com.jordan.search;

import java.util.Scanner;

public class LinearSearch {

	static Scanner scan = new Scanner(System.in);
	
	static int[] dataArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static int dataArrayLength = dataArray.length;
	
	static boolean found = false;
	static int position;
	static int searchIterations = 0;
	
	static int searchTerm;

	public static void main(String[] args) {
		System.out.println("Java binary search");
		System.out.println("------------------");

		System.out.println("Which item do you wish to search for?");
		searchTerm = scan.nextInt();
		
		while ((found == false) && (position <= (dataArrayLength -1))) {
			
			if (dataArray[position] == searchTerm) {
				found = true;
				break;
			}
			else {
				position += 1;
			}
			++searchIterations;
		}
		
		if (found == true ) {
			System.out.println("Your item has been found, it was positioned at the " + position + " entry.");
			System.out.println("Your item was found in " + searchIterations + " iterations.");
		} else {
			System.out.println("Your item couldn't be found within the list");
		}
	}
	
}
