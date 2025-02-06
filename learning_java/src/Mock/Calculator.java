package Mock;

public class Calculator {
	public static void main(String[] args) {
		double s=300.00, x=30.00;
		
		double result = calculatorOperation(s, x);
		
		
		System.out.println(result);
		
	}
	public static double calculatorOperation(double s, double x) {
		double result=0;

		String operation= "mul";
		switch(operation) {
 		case "sum":
 			result=s+x;
 			
 			break;
 		
 		case "sub":
 			result=s-x;
 			
 			break;
 		
 		case "mul":
 			result=s*x;
 			break;
 		
 		case "dev":
 			result=s/x;
 			break;
 		
		default:
			System.out.println("not satisfied");
		}
		return result;
		
	}
	

}
