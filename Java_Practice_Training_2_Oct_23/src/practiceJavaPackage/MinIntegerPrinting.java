package practiceJavaPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinIntegerPrinting {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name below: \n");

		String name = br.readLine();

		System.out.println("Hi " + name);

		System.out.println("Enter the number between 1 to 10 of integers you wish to enter: ");
		int numVal = Integer.parseInt(br.readLine());
		System.out.println(numVal);
		int arr[] = new int[numVal];
		System.out.println("Enter " + numVal + " values separated by space within the range of 1 to 100.");
		String s1 = br.readLine();
		String[] s2 = s1.split(" ");
		System.out.println("s1 = " + s1);
		
		for (int i = 0; i < numVal; i++) {
			arr[i] = Integer.parseInt(s2[i]);
			System.out.println(s2[i]);
		}

		System.out.println("The numbers entered are : \n");
		for (int i = 0; i < numVal; i++) {
			System.out.println(arr[i]);
		}
		
		int minNum=arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		System.out.println("Minimum Number is : "+ minNum);

	}
}
