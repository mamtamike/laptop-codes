package ExceptionHandling;

public class ThrowsExample {
	public static int divide(int a,int b) throws ArithmeticException{
		int c;
		c=a/b;
		return c;
		
		
	}
	public static void main(String[] args) {
		try {
		int x= divide(2,0);
		System.out.println(x);
	}
		catch(ArithmeticException e) {
			
			System.out.println("error caught: "+e.getMessage());
		}
	}

}