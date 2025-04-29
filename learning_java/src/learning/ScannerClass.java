package learning;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	System.out.println("Enter user input");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number 1");
	boolean check =sc.hasNextInt();
    System.out.println(check);
	int a=sc.nextInt();
	System.out.println("enter number 2");
	int b=sc.nextInt();
	System.out.println("enter string");         
	String string=sc.next();
	System.out.println(string);
	 int sum=a+b;
	 System.out.println("sum of two numbers is "+sum);
	 	 
}
}
