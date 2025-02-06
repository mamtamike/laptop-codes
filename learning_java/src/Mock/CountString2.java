package Mock;

public class CountString2 {
	public static void main(String[] args) {
		String str= "mamta chaudhary 123 $@";
		countCharacterType(str);
	}
	public static void countCharacterType(String str) {
		  int vowels = 0, consonant = 0, space = 0,   digit = 0, specialChar =0;
          
		    char ch;
		    for(int i=0; i<str.length(); i++)
		    {
		    	
		    	ch=str.charAt(i);
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
		        System.out.println("vowels: " +vowels +  ", digit: " +digit + ", consonant: " +consonant + ", space: " + space + ", String length: "+ str.length());  // Output user input
		        
		    
		  
	}
	

}
