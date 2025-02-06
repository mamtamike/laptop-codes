package ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {
		try {
		int a= 1000;
		int b=0;
		int c=a/b;
		System.out.println("the result is c " +c);
		}
		catch(Exception e) {
			System.out.println("we failed to devide,reason is: ");
			System.out.println(e.getMessage());
		}
		System.out.println("end of program");
	}
		

}
