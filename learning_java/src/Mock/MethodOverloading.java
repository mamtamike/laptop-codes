package Mock;

public class MethodOverloading { //in method overloading we can have same method names but different parameters
	//method overloading can not be performed by changing the return types of methods
	
	public static void main(String[] args) {
		MethodOverloading md= new MethodOverloading();
		md.multiply(10,30);
		md.multiply(100, 60);
		System.out.println(md.multiply(10, 30));
		System.out.println(md.multiply(100, 60));
		foo();
		foo(2300);
	}
		
		public int multiply(int a , int b) {
			return a*b;	
		}
		public double multiply(double x, double y) {
			return x*y;
	}
		
		static void foo() {
			System.out.println("hello");
		}
		static void foo(int a) {
			System.out.println("hello "+a+ " morning");
		}

}
