package practiceJavaPackage;

public class FibinocciSeries {

	public static void main(String[] args) {
		int SeriesLength=6;
		
		System.out.println("Series to be printed till  "+ SeriesLength);
		
		if(SeriesLength <= 0 ) {
			System.out.println("FibinocciSeries length should be greater than 0");
		}else if(SeriesLength == 1) {
			System.out.println("Fibinocci Series is: "+ 0);
			} else if(SeriesLength == 2) {
				System.out.println("Fibinocci Series is: \n"+ 0 + "\n" + 1);
			} else {
				int f1 = 0, f2 = 1, f3;
				System.out.println("Fibinocci Series is as below: \n"+ f1 + "\n" + f2);
				
				for (int i = 1; i<= SeriesLength; i++ ) {
					f3 = f1 + f2;
					System.out.println(f3);
//				 
					f1 = f2; 
					f2 = f3;
				}
			}
	}
}
