package JavaPractice;
public class ArraySum {

	public static void main(String[] args) {
		
	int[] array= {9,7,1,8,5,8,9,1,2,0};
	int sum=0;
	
	//System.out.println(Add(array));
//}
	/*public static int  Add(int[] array) {
	int result=0;	
	
	for(int i=0; i<array.length; i++) {
		
		result=result+array[i];
	}
	return result;		
	}*/
	
	for(int element: array) {
		sum=sum+element;
	}
	System.out.println(sum);
	}	
	
}

