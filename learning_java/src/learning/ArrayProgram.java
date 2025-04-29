package learning;

public class ArrayProgram {
	public static void main(String[] args) {
		int [] marks= {2,3,4,5,6,7};
		for(int i=0; i<marks.length; i++) {

			if(i==4) {
                break;
			}
			System.out.println(marks[i]);
		}
		System.out.println("length of array is "+marks.length);

//		for(int element:marks) {
//			System.out.println(element);
//		}
	}

}
