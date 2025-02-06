package learning;

public class ParametersArgumentsDemo {
	public static void main(String[] args) {
		ParametersArgumentsDemo pr = new ParametersArgumentsDemo();
				System.out.println(pr.addNumbers(5, 10));
			System.out.println(pr.logicName("harry"));
	
	}
	public int addNumbers(int x, int y) {
	return x+y;
	}
	public String logicName(String s){
		return s;
	}	
}

