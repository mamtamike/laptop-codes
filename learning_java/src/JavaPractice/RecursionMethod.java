package JavaPractice;

public class RecursionMethod {
	int fact=1;

public static void main(String[] args) {
	
	int result;
	RecursionMethod f= new RecursionMethod();
	result=f.calFact(5);
	System.out.println(result);
}
	
	public int calFact(int n) {

		if(n>1) {
		fact=fact*n;
		calFact(n-1);	
	}
		return fact;
	}
}

