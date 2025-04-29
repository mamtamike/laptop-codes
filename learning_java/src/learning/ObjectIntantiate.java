package learning;

public class ObjectIntantiate 
{
	
	public static void main(String[] args) {
		
		ObjectIntantiate r = new ObjectIntantiate();
		ObjectIntantiate p = new ObjectIntantiate();
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