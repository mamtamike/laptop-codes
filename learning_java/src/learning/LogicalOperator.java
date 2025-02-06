package learning;

public class LogicalOperator {
	public static void main(String[] args) {
		String str1= "raining";
		String str2= "cold";
		int n=6;
		int m=10;
		
		if ((str1=="raining") && (str2=="cold"))
		{
			
		System.out.println("wear a jacket");
	   }
		else
		{
			System.out.println("not wear a jacket");
		}
		
	if((str1=="raining")||(str2!="cold"))
	{
		System.out.println("wear a jacket");
	}
	else
		
	{
		System.out.println("not wear a jacket");
	}
	if ((n>2)&&(m<10))
	{
		System.out.println( "numbers are between 1 to 10");
	}
	else {
		System.out.println("numbers are not between 1 to 10");
	}
	if ((n>=6 || m<=12)) {
		System.out.println("numbers are between 1 to 12");
	}
	else {
		System.out.println("numbers are not between 1 to 12");
	}
		
	}

}
