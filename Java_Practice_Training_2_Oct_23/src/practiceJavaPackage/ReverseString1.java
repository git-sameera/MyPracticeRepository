package practiceJavaPackage;

public class ReverseString1 {

	public static void main(String[] args) {

		String str1 = "Hello Sameera";

		char charArray[] = str1.toCharArray();

		// Printing the String copied to Character array
		System.out.println(charArray);

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
