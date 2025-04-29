package JavaPractice;

import java.util.Scanner;

public class StringPalindrome2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		sc.close();
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();	//remove all spaces from string and convert it to lowercase 
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if original and reversed are equal
        if (cleaned.equals(reversed)) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
        }

}
