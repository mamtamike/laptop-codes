package JavaPractice;

public class VarArgs {
	public static int sum(int ...arr) { //all arguments in the form of array
		int result=0;
		for(int a: arr) {
			result+=a; //result=result+a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(4,8,5,9));
	}

}
