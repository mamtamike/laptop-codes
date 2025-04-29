package JavaPractice;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		
		double num1=sc.nextDouble();
		
System.out.println("Enter second number");
		
		double num2=sc.nextDouble();
		
		
		System.out.println("Enter operators (=,-,*,/):");
		char operator=sc.next().charAt(0);
		
		double result;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println("result is:" +result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("result is: "+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("result is:" +result);
			break;
		case '/':
			if(num2 !=0) {
			result=num1/num2;
			System.out.println("result is:" +result);
			
			}
			else {
				System.out.println("error in devision");
			}
			break;
			
			default:
			System.out.println("invalid operator");
			break;
		}
				
	}

}
