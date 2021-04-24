package com.jordan.sort;

public class Bubble {
	
	//{1, 1, 2, 3, 5, 8, 13, 21}
	static int[] dataArray = {13, 3, 2, 1, 5, 8, 21, 1};
	static int dataArrayLength = dataArray.length;
	static int position = 0;
	static int temp = 0;
	static boolean swapMode = true;
	
	static int sort = 0;

	public static void main(String[] args) {
		System.out.println("Java bubble sort");
		System.out.println("----------------");
		
		while (swapMode == true) {
			swapMode = false;
			System.out.print("\n Sort: " + sort + " { ");
			for (position = 0; position < dataArrayLength; position++) {
				System.out.print(dataArray[position] + " ");
			}
			System.out.print("}");
			for (position = 0 ; position < (dataArrayLength - 1); position++) {
				if (dataArray[position] > dataArray[position + 1]) {
					temp = dataArray[position];
					dataArray[position] = dataArray[position + 1];
					dataArray[position + 1] = temp;
					swapMode = true;
				}
			}
			++sort;
		}
	}
}



