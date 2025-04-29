package learning;

public class Variables {
	
	int i = 100;//instance variable, outside of main method or any method/function  but with in class
    static char ch='a';  //static variable, outside of main method or any method but within class 
	public static void main(String[] args) {
		int j=150;
		char c= 'm';
		
		Variables ref=new Variables();//we have to make object of class to call instance variable in main method 
		
		System.out.println(ref.i);
		System.out.println(c);
		System.out.println(j);
		System.out.println(ch);  //static variable can be called in main method without instantiating it
				
	}
}
