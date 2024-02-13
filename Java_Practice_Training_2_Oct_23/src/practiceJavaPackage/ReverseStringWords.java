package practiceJavaPackage;

public class ReverseStringWords {

	public static void main(String[] args) {
		String sourceStr = "Hello Sameera Welcome To Java Class";
		String destStr = " ";
		String[] wordsOfStr = sourceStr.split(" ");
		String[] destStr1 = new String[wordsOfStr.length];
		int j = 0;

		System.out.println("Source String given is: " + sourceStr);

		for (int i = wordsOfStr.length - 1; i >= 0; i--) {
			//System.out.print(wordsOfStr[i] + " ");
			
//			System.out.print(wordsOfStr[i]);
			destStr1[j] = wordsOfStr[i];
		
//			System.out.println(destStr1[j]);
			j++;
		}
		destStr = destStr1.toString();
		destStr = String.join(" ", destStr1);
		
		System.out.println("\n String with words in reverse order is : " + destStr);
	}
}
