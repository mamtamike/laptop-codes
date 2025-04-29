package JavaPractice;

import java.util.Random;

public class ArrayOperation {
	public static void main(String[] args) {
		int[] array= {9,7,1,8,5,8,9,1,2,0};
		System.out.println(arrayLastElement(array));	
		System.out.println(arrayFirstElement(array));
		System.out.println(arrayRandomElement(array));
		change(array);
		System.out.println(array[0]);	
		
	}
	public static int arrayLastElement(int[]array) {
		int lastElement= array[array.length-1];
		return lastElement;	
	}
	public static int arrayFirstElement(int[]array) {
		int firstElement= array[0];
		return firstElement;	
	}
	public static int arrayRandomElement(int[]array) {
		int randomElement= array[new Random().nextInt(array.length)];
		return randomElement;	
}
	static void change(int[]array) {
		array[0]=10;	
	}
 }

