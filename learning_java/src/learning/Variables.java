package learning;

public class Variables {
	
	int i = 100;//instance variable

	public static void main(String[] args) {
		int j=150;
		char c= 'm';
		
		Variables ref=new Variables();//we have to make object of class to call instance variable in main method and to call it in any method
		
		System.out.println(ref.i);
		System.out.println(c);
		System.out.println(j);
				
	}
}
