package JavaPractice;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner myName= new Scanner(System.in);
		System.out.println("entre name,age,salary:");
		
		String name= myName.nextLine();
		int age= myName.nextInt();
		float salary= myName.nextFloat();
		
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
		System.out.println("Salary:" +salary);
		
	
	}

}
