package pckg5;

import java.util.Arrays;

public class secondMax {
	public static void isSecondMax(int ar[]) {
		Arrays.sort(ar);
		
		int pos = ar.length - 2;
		
		for(int i = ar.length; i >= 0; i--) {
			if(i == pos) {
				System.out.println("This is the second max " + ar[i]);
			}
		}
	}

}
