package Mock;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		
	
//user input
		//print table for input provided
	Scanner myNumber= new Scanner(System.in);
System.out.println("entre number");
			int number= myNumber.nextInt();
		
		System.out.println("number" +number);
		
	for(int i=1; i<=10; i++)
	{
		System.out.println(number*i);
	}
	
	}

}
