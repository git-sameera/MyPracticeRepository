package practiceJavaPackage;

import java.util.Scanner;

public class PrimeFactorsList {

	public static void main(String[] args) {
		
		Scanner myScannerObj = new Scanner(System.in);
		int numInput; 
		System.out.println("This program prints the Prime Factors of a number of your choice. ");
		System.out.println("Enter the number to find Prime Factors: \n");
		numInput = myScannerObj.nextInt();
		
		PrimeFactors(numInput);
		
		myScannerObj.close();
		
	}

	public static void PrimeFactors(int numInput) {
		
		// Printing the number of 2 as factors of given number
		
		while(numInput % 2 == 0) {
			System.out.println(2 + " ");
			numInput = numInput / 2;
			
		}
		// Printing the next prime numbers starting from 3
		
		for(int i=3; i<= Math.sqrt(numInput); i += 2) {
			while(numInput % i == 0) {
				System.out.println(i + "  ");
				numInput /= i;
			}
		}
		
		if (numInput > 2)
            System.out.print(numInput);
		
	}
}
