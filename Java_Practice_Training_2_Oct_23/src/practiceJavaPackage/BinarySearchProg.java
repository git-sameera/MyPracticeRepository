package practiceJavaPackage;

import java.util.Scanner;

public class BinarySearchProg {

	public static void main(String[] args) {

		int[] numArray = { 10, 12, 34, 65, 88, 89, 96, 100, 144, 99 };
//		int searchNum = 100;
		int searchNumInput;
		int arrayLen = numArray.length;

		Scanner myScannerObj = new Scanner(System.in);
			
		
		System.out.println("This program searches for the given number using Binary search algorithm");
		System.out.println("Enter the number to be searched in the below list and hit enter: ");
		System.out.print("Elements in the array to search from are:\n ");
		for (int i = 0; i <= arrayLen - 1; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("\n Enter your input here:   ");
		searchNumInput = myScannerObj.nextInt();
		int numPosition;
		numPosition = BinarySearch(numArray, 0, arrayLen - 1,  searchNumInput);  //searchNum);
		System.out.println("Result is as below::::::::: ");
		if (numPosition == -1) {
			System.out.println("\nElement " + searchNumInput + " is not present in the search list");
		} else {
			System.out.println(
					"\n Element " + searchNumInput + " is present at the poistion " + numPosition + " of the search list");
		}

		myScannerObj.close();
	}

	public static int BinarySearch(int[] searchArray, int first, int last, int value) {
		int midVal;

		if (last >= first) {
			midVal = (last + first) / 2;

			if (searchArray[midVal] == value) {
				return midVal + 1; // If the value being searched is the middle value then return the poistion of
									// the value
			} else if (searchArray[midVal] > value) { // If the value being searched is less than middle value search in
														// the left sub array

				return BinarySearch(searchArray, first, midVal - 1, value);

			} else if (searchArray[midVal] < value) { // If the value being searched is greater than middle value search
														// in the right sub array
				return BinarySearch(searchArray, midVal + 1, last, value);

			}
		}

		return -1;
	}
}
