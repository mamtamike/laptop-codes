package JavaPractice;

import java.util.Scanner;

public class StringPalindrome {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter string to check palindrom");

    String input = sc.nextLine();  // Read user input
    String userString = input.replaceAll("\\s", "").toLowerCase();

    System.out.println("userString is: " + userString);  // Output user input
    
    String newString = "";
    char x;
    
    for (int i = 0; i < userString.length(); i++) {
          
          // extracts each character
        x = userString.charAt(i);
      
          // adds each character in
        // front of the existing string
        System.out.println("x:" +x + ", newString:" +newString);
        
        
        newString =x+newString ; 
    }
  
    System.out.println("reverse string is:" +newString);
    
    if(userString.equals(newString))
    {
    	System.out.println("user string is palindrom");
    }
    else
    {
    	System.out.println("user string is not palindrom");
    }
    sc.close();
}
}
