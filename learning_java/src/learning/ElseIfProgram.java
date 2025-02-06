package learning;

public class ElseIfProgram {
	public static void main(String[] args) {
	int a=40;
	int b=20;
	int c=30;
if(a>b)
{
	System.out.println("a is greater than b");
	
	if(a<c) {
		System.out.println("a is less than c");
	}
	else {
		System.out.println("in the final nested else block");
	}

}
else if(a<=b)
{
	System.out.println("a is less than or equal to b");
}
else if(a!=c) 
{
	System.out.println("a is not equal to c");
}
else
{
	System.out.println("In the final else block");
}
}
}



