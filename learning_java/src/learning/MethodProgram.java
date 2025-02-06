package learning;

public class MethodProgram {
static	int Logic(int x, int y) { //method define
		int z;
		
		if(x>y) {
		z=x+y;
		}
		else {
			z=(x+y)*5;
		}
	//	x=566;
		return z;
	}
	public static void main(String[] args) { // call method in main method
		int a=5;
		int b=7;
		int c;
		c=Logic(a,b); //a=x , b=y, z=c
		System.out.println(c);
		
		int a1=5;
		int a2=2;
		int d;
		d=Logic(a1,a2);
		System.out.println(d);
		
		int result;
		result=Logic(5,3);
		System.out.println(result);
		
		//method invocation using object creation
//		int l=1;
//		int m=9;
//		int e;
//		MethodProgram obj=new MethodProgram();
//		e=obj.Logic(l, m);
//		System.out.println(e);
//		
		
	}

}
