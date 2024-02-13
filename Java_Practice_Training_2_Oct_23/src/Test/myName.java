package Test;

public class myName {

	public static void main(String[] args) {
		// Print the repeated letter of the string "Sameera"
		
		String name = "Sameera";
		char[] nameChar = name.toCharArray();
		
		for(int i =name.length()-1; i>= 0; i--) {
				System.out.print(nameChar[i]);

			}
		

	}

}
