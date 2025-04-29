package JavaPractice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		sc.close();
		String reversed="";
		for(int i=s.length()-1; i>=0; i--) {
			reversed=reversed+s.charAt(i);
		}
		System.out.println("reversed string is:" +reversed);
		
//		  String reversed = new StringBuilder(s).reverse().toString();
//
//	      System.out.println("Reversed string: " + reversed);
//		
//		
	}

}
