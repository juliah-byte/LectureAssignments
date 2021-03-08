package pckg4;

public class maxMin {
	
	public static void isMaxMin(int ay[]) {
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < ay.length - 1; i++) {
			
			if(ay[i+1] > ay[i]) {
				max = ay[i + 1];
			}
			
			if(ay[i + 1] < ay[i]) {
				min = ay[i + 1];
			}
			
		}
		
		System.out.println("The min is " + min);
		System.out.println("The max is " + max);
	}

}
