package JavaPractice;

public class StringMethods {
	public static void main(String[] args) {
		String name="harry";
		String language="JAVA";
		String program="java";
		String entry=" India ";
		System.out.println(name.length());
		System.out.println(name.charAt(1)); //returns the character at specific index of a string
		System.out.println(name.substring(2));
		System.out.println(name.substring(1, 3));
		System.out.println(language.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(language.equals(program));
		System.out.println(language.equalsIgnoreCase(program));
		System.out.println(entry.trim());
		System.out.println(entry.replace('n', 'm'));
		System.out.println(name.repeat(3)); 
		
		
	}

}
