package practiceJavaPackage;

public class BubbleSortProg {
	
	public static void BubbleSort(int[] sortArray, int arrayLen) {
		boolean isSwapped;
		int temp;


for (int i = 0; i < arrayLen - 1; i++) {
			isSwapped = false;

			for (int j = 0; j < (arrayLen-i) -1; j++) {
				
				if (sortArray[j] > sortArray[j+1]) {
					temp = sortArray[j];
					sortArray[j] = sortArray[j + 1];
					sortArray[j + 1] = temp;
					isSwapped = true;
				}
			}
				if (isSwapped == false) {
					break;
				}
			
		}
	}

	static void PrintArray(int[] Array, int arrayLen) {

		for (int i = 0; i <= arrayLen - 1; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] toBeSortedArray = { 24, 5, 66, 2, 100, 39,1, 22, 7, 1 ,100, 90 };

		int toBeSortedArrayLen = toBeSortedArray.length;

		System.out.println("Array before sorting : \n");
		PrintArray(toBeSortedArray, toBeSortedArrayLen);
		BubbleSort(toBeSortedArray, toBeSortedArrayLen);
		System.out.println("Array after sorting using bubble sort algorithm: \n");
		PrintArray(toBeSortedArray, toBeSortedArrayLen);

	}

}
