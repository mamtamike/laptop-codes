package ExceptionHandling;

public class ThrowException {
	public static void main(String[] args) {
		System.out.println("before division");
	
	try {
		int i=10;
		System.out.println(i/0);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		System.out.println(e.getStackTrace());
		e.printStackTrace();
	}
	finally {
		System.out.println("this finally block");
	}
 System.out.println("after division");
}
}