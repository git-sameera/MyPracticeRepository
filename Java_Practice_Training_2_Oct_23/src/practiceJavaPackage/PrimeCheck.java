package practiceJavaPackage;

public class PrimeCheck {

	public static void main(String[] args) {
		
		int numInput = 61;
		boolean flag = false;
		for (int i=2; i<= numInput/2; ++i) {
			if(numInput % i == 0) {
				flag = true; 
				break;
			}
		}
		if(!flag) {
			System.out.println(numInput + " is a Prime Number");
		}else {
			System.out.println(numInput + "  is not a Prime Number");
		}

	}

}
