package JavaPractice;

public class ArraySorted {
	public static void main(String[] args) {
		int[] array= {9,7,1,8,5,8,9,1,2,0};
		boolean isSorted=true;
		for(int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
			if(array[i]>array[i+1]) {
				isSorted= false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("array is not sorted");
		}
	}

}
