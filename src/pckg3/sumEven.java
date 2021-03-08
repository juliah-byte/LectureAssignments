package pckg3;

public class sumEven {
	
	public static void isEven(int ay[]) {
		
		int count = 0;
		
		for (int i = 0; i < ay.length; i++) {
			if(ay[i] % 2 == 0) {
				count += ay[i];
			}
		}
		
		System.out.println("The sum of even numbers in the"
				+ " array is " + count);
	}

}
