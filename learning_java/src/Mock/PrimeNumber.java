package Mock;

public class PrimeNumber {
	public static void main(String[] args) {
	int n=10;
	 if (isPrime(n)) {
         System.out.println(n + " is a prime number.");
     } else {
         System.out.println(n + " is not a prime number.");
     }

	}
	
				public static boolean isPrime(int n) {
				
					if(n<=1) {
						return false;
					}
					for(int i=2; i<=Math.sqrt(n); i++) {// n=3 1.7
						
						if(n%i==0) {
						return false;
								}
						
				}
					return true;
				}
					
						
				}
						
				
				
			
			
				
				
	