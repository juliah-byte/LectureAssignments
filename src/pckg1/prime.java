package pckg1;


public class prime {
	public static void main(String[] args) {
		
		int ar[] = {22,12,5,17,32,51};
		
		for(int i = 0; i < ar.length; i++) {
			
			if(ar[i]%2 != 0) {
				System.out.println(ar[i] + " is a prime number.");
			}
			
		}
		
	}

}
