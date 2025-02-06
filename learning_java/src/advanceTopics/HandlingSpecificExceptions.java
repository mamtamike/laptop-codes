package advanceTopics;

import java.util.Scanner;

public class HandlingSpecificExceptions {
 public static void main(String[] args) {
	 int [] array= {1,6,7};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array index");
	int ind=sc.nextInt();
	
	System.out.println("Enter number");
	int number=sc.nextInt();
	try {
		System.out.println(array[ind]/number);
	}
	
	catch(ArithmeticException e) {
		System.out.println(" ArithmeticException ocurred: ");
		System.out.println(e);	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundException occured: ");
		System.out.println(e);	
	}
	catch(Exception e) {
		System.out.println("array division failed reason: ");
		System.out.println(e);
	}
	}
}

