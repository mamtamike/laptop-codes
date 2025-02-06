 package learning;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		
	/*switch (expression){
	 * case1:
	 * statements
	 * case2:
	 * statements
	 * default:
	 * statements
	 */
		
		int day = 4;
		switch (day) {   //switch(variable){
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thur");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
		default:
			System.out.println("none of the cases satisfied");
			
		}
	}
}
