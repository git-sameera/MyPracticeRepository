package practiceJavaPackage;

public class AscendDescendArray {

	public static int[] assendArray(int[] Array1) {

		int temp = 0;
		for (int i = 0; i <= Array1.length-1; i++) {
			for (int j = 0; j <= i; j++) {
				if (Array1[i] <= Array1[j]) {
					temp = Array1[i];
					Array1[i] = Array1[j];
					Array1[j] = temp;

				}
			}
		}
		return Array1;
	}
	
	public static int[] descendArray(int[] Array1) {

		int temp = 0;
		for (int i = 0; i <= Array1.length-1; i++) {
			for (int j = 0; j <= i; j++) {
				if (Array1[i] >= Array1[j]) {
					temp = Array1[i];
					Array1[i] = Array1[j];
					Array1[j] = temp;

				}
			}
		}
		return Array1;
	}

	public static void printArray(int[] Array) {
		for(int i=0; i<= Array.length - 1; i++) {
			System.out.print(Array[i]+ " ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		int[] Array1 = { 4, 5, 1, 56, 7, 5, 3,0 };
		int[] Array2;

		System.out.println("Array numbers before ascending arrangement: ");
		printArray(Array1);
		Array2 = assendArray(Array1);
		System.out.println("Array numbers after ascending arrangement: ");
		printArray(Array2);
		
//		System.out.println("Array numbers before descending arrangement: ");
//		printArray(Array1);
		Array2 = descendArray(Array1);
		System.out.println("Array numbers after descending arrangement: ");
		printArray(Array2);
	}
}
