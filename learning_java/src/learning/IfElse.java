package learning;

public class IfElse {
public static void main(String[] args) {
	

		int num1= 10;
		int num2= 20; 
		
		if(num1>num2)
		{
			System.out.println("Number1 is greater than Number2");
		}
		else if(num1==num2)
		{
			System.out.println("num1 is equal to num2");
		}
		else if(num1<num2)
		{
			System.out.println("num1 is less than num2");
		}
		else
		{
			System.out.println("In the final else block");
		}
	}

}
