package JavaPractice;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String s = sc.nextLine(); // Input a number as a string
		sc.close();

		try {
			// Convert the string to an integer
			int n = Integer.parseInt(s);
			System.out.println("The integer value is: " + n);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Not a valid integer.");
		}
	}
}
