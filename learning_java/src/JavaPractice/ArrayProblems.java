package JavaPractice;

public class ArrayProblems {
	public static void main(String[] args) {
		int[] array= {10,20,30,40};
		
	/*	int num=70;//problem 1: search weather the specific element exits in array
		boolean isInArray=false;
		for(int element:array) {
			if(num==element) {
				isInArray= true;
				break;
			}
		}
			if(isInArray) {
				System.out.println("num is in array");
			}
			else {
				System.out.println("num is not in array");
			}*/
		//problem2: average of all elements of array
			int sum=0;
			for(int element:array) {
				sum=sum+element;
			}
			System.out.println(sum/array.length);
	
	}

}
