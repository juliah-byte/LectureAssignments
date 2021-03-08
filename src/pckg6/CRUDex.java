package pckg6;

import java.util.Arrays;

public class CRUDex {
	public static void main(String[] args) {
		int[] ar = new int[] {21, 44, 7, 12, 75, 0};
		
		int n = 5;
		int ele = 50;
		int pos = 4;
		
		// Shifting elements before insertion 
		for(int i = n; i > pos -1; --i) {
			ar[i] = ar[i - 1];
		}
		
		//Setting value of new position
		ar[pos - 1] = ele;
		n += 1;
		
		for(int i = 0; i < n; ++i) {
			System.out.print(ar[i] + " ");
		}
		
		int delpos = 3;
		//Deletion
		for(int i = delpos - 1; i < n; ++i) {
			ar[i] = ar[i + 1];
		}
		
		System.out.println("\n");
		--n;
		
		for(int i = 0; i < n; ++i) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println("\n");
		
		// Utilizing java.util.Arrays
		Arrays.sort(ar);
		
		
		for(int i = 0; i < n; ++i) {
			System.out.print(ar[i] + " ");
		}
		
	}

}
