package Mock;

public class ArrayMaxMin {
	public static void main(String[] args) {
		int[] array= {9,7,1,8,5,8,9,1,2,0};
		int max=0;
		for(int element:array) {
			if(element>max) {
				max=element;
			}	
		}
		System.out.println("maximum value is " + max);
		int min=0;
	for(int element:array) {
		if(element<min) {
			min=element;	
		}
	}
System.out.println("minimum value is " +min);	
	}

}
