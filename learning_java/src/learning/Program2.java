package learning;

public class Program2 
{
	
	public static void main(String[] args) {
		
		Program2 r = new Program2();
		Program2 p = new Program2();
		r.add();
		p.mul();
		
	}
	void add()
	{
		int a=20;
		int b=30;
		b++;
		System.out.println(a+b);
	}
   
	void mul()
	{
		int c=20;
		int d=30;
		c--;
		System.out.println(c*d);
		
	}	
}