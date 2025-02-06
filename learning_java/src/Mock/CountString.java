package Mock;

import java.util.Scanner;

public class CountString {

public static void main(String[] args) {
	//user input
	//count vowels consonant digits space
	//output
	
	Scanner myObject = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter string to check count");

    String userString = myObject.nextLine();  // Read user input
    int vowels = 0, consonant = 0, space = 0,   digit = 0, specialChar =0;
           
    char ch;
    for(int i=0; i<userString.length(); i++)
    {
    	
    	ch=userString.charAt(i);
    	if((ch>='a' && ch<='z' ) ||
    	(ch>='A' && ch<='Z')){
    		
    	
    	if(ch=='a' ||ch=='i'||ch=='e' || ch=='o' || ch=='u') {
    		vowels++;
    
    	}
    	else {
    		consonant++;
    	}
    	}
   
    	if(ch>='0' && ch<='9') {
    		digit++;
    	}
    
     	if(ch==' ') {
    		space++;
    	}
    } 
    System.out.println("vowels: " +vowels +  ", digit: " +digit + ", consonant: " +consonant + ", space: " + space + ", String length: "+ userString.length());  // Output user input
 
	

}
}
