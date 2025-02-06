package ExceptionHandling;

public class ThrowExceptionExample {
	public static void ageElegibility(int age) {
	//exception throw
		if(age<18) {
			throw new IllegalArgumentException();		
	        }
		System.out.println("eligible for vote");
	      }
	public static void main(String[] args) {
		//exception handling
		try {
			
			ageElegibility(20);
			ageElegibility(16);
		}
		catch(IllegalArgumentException e) {
			System.out.println("exception cuaght: "+e.getMessage());
			System.out.println("exception cuaght: "+e.toString());
			System.out.println("exception cuaght: "+e.getStackTrace());
			e.printStackTrace();
		}
		System.out.println("program continues...");
		}
	}


