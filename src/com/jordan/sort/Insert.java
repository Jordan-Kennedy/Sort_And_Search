package com.jordan.sort;

public class Insert {
	
	//{1, 1, 2, 3, 5, 8, 13, 21}
	static int[] dataArray = {13, 3, 2, 1, 5, 8, 21, 1};
	static int dataArrayLength = dataArray.length;
	static int position = 0;
	static int temp = 0;
	
	static int sort = 0;

	public static void main(String[] args) {
		System.out.println("Java bubble sort");
		System.out.println("----------------");
		
		System.out.print("\n Sort: " + sort + " { ");
		for (int i = 0; i < dataArrayLength; i++) {
			System.out.print(dataArray[i] + " ");
		}
		System.out.println("}");
		for (position = 1 ; position < dataArrayLength; position++) {
			int tempPosition = position;
			while (dataArray[tempPosition] < dataArray[tempPosition - 1]) {
				temp = dataArray[tempPosition];
				dataArray[tempPosition] = dataArray[tempPosition - 1];
				dataArray[tempPosition - 1] = temp;
				if (tempPosition > 1) {
					tempPosition = tempPosition - 1;
				}
			}
			for (int i = 0; i < dataArrayLength; i++) {
				System.out.print(dataArray[i] + " ");
			}
			System.out.print("}");
		}
		++sort;
	}
}




