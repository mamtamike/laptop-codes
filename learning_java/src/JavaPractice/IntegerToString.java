package JavaPractice;

import java.util.Scanner;

public class IntegerToString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer n: ");
		int n=sc.nextInt();
		sc.close();
		String s=Integer.toString(n);
		if(s.equals(Integer.toString(n))) {
			System.out.println("Good job");
		}
		else {
			System.out.println("wrong answer");
		}
	}

}
