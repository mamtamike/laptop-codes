package Mock;

public class ReverseArray {
	public static void main(String[] args) {
	
		//float [] array= {9.5f,7.0f,1.9f,8.6f,5.4f,0.0f};
		int [] array= {9,7,1,8,5,1};
		
		//String [] name= {"mamta","anchal", "rashi"};
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		
		}
		//for(int j=0; j<=name.length; j++) {
			//System.out.println(name[j]);
		//}
		//for(float element: array) {  //for each loop for array
			//System.out.println(element);
		//}
		
//		int l= array.length;
//		int temp;
//		int n=Math.floorDiv( l, 2);
//		for(int i=0; i<n; i++) {
//			//a  b  temp  swapping logic
//			//|9| |0| ||  swapping logic
//			temp=array[i]; //swapping logic in code
//			array[i]=array[l-i-1];//swapping logic in code
//			array[l-i-1]=temp;//swapping logic in code
//		}
//		for(int element:array) {
//		System.out.print(element+" ");
//		}
//			
		
	}

}
