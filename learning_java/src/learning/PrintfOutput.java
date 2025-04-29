package learning;

public class PrintfOutput {
	public static void main(String[] args) {
		int ten=10;
		String name="harry";
		double percentage=6.23;
		float number=2.5f;
		char ch='m';
		//print with format specifiers
		System.out.printf("%d\n",ten); // \n to change output into next line
		System.out.printf("%s\n",name);
		System.out.printf("%f%n",number); // %n can also be used to change output into next line automatically
		System.out.printf("%f%n",percentage);	
		System.out.printf("designation=%s\n",name);
		System.out.printf("%d\n",10);
		System.out.printf("%c",ch);
	}

}
