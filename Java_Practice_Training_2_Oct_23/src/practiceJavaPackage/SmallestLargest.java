package practiceJavaPackage;

public class SmallestLargest {

	public static void main(String[] args) {

		int[] numList = { 34, 101, 4, 7, 32, 77, 56, 90, 21, };
		int smallNum = numList[0];
		int largeNum = numList[0];

		for (int i = 0; i <= numList.length-1; i++) {

			if (numList[i] > largeNum) {
				largeNum = numList[i];
			} else if (numList[i] < smallNum) {
				smallNum = numList[i];
			}
		}
		System.out.println("List of numbers given is : "+ numList);
		System.out.println("Smallest number in the list is : "+ smallNum);
		System.out.println("Largest number in the list is : "+ largeNum);
	}
}
