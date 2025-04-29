package learning;

public class Count {   
	public static void main(String[] args) {
		int count=0;
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//			count++;
//		}
//		System.out.println(count);
	int[] array= {1,2,4,8,5,6};
	for(int j=0; j<array.length; j++) {
		if(j % 2==0) { //count even numbers in this array
			count++;
		}
	}
	System.out.println(count);
	System.out.println(array.length);
	}

}
