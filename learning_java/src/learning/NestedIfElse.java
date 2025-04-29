package learning;

public class NestedIfElse {
	public static void main(String[] args) {
		int n=10;
		int m=20;
		int s=30;
		
		if(n<m) {
		
			System.out.println("n is less than m");
		
		if(m<s)
		{
			System.out.println("m is less than s");
		}
		else
		{
			System.out.println("in the nested else block");
		}
		}
		
		 if (s<n)
		{
			System.out.println("s is greater than n");
		}
		else
		{
			System.out.println("in the final else block");
		}
	}
}
