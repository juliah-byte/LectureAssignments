package sum;

public class isSum {
	
	
	public static void checkSum() {
		
		int countEven = 0;
		int countOdd = 0;
		
	
		for( int i = 1; i <= 100; i++) {
		
			while(i% 2 == 0) {
				countEven += i;
				break;
			}
			
			while(i%2 != 0) {
				countOdd += i;
				break;
			}
		}
				
		System.out.println("The sum of all even numbers is " + countEven);
		System.out.println("The sum of all odd numbes is " + countOdd);
		
	}
}

