package practiceJavaPackage;

public class SwapTwoNumbers {

	public static int[] a =  {5, 14};
	public static int[] b;
	public static int[] swapNumbers(int[] a) {
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
		return a;

	}

	public static void main(String[] args) {

//		int a = 5, b = 14;
		System.out.println("Numbers before swapping: " + a[0] + " " + a[1]);
		b = swapNumbers(a);
		System.out.println("Numbers after swapping : " + b[0] + " " + b[1]);
	}
}


