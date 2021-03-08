package pckg2;

public class palindrome {
	
	public static void isPalindrome(int array[]) {
		for(int i = 0; i < array.length; i++) {
			
			int ro = array[i]/10;
			int re = array[i] % 10;
			
			if(ro == re) {
			
				System.out.println(array[i] + " is a palindrome." );
			}
			else {
				System.out.println(array[i] + " is not a palindrome " + re);
			}
		}
	}

}
