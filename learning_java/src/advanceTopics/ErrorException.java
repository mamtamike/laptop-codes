package advanceTopics;

import java.util.Scanner;

public class ErrorException {
	public static void main(String[] args) {
	//int i=2 //syntax error
		System.out.println(2);
			for(int i=1; i<5; i++) {
				System.out.println(2*i+1); //logical error
			}
			int k;
			Scanner sc=new Scanner(System.in);
			k=sc.nextInt();
			System.out.println("Integer part of 100 is divided by k is: " +100/k); //if we input value of k as zero it will show exception
			                                                                         // java arithmetic error java does not support division from 0
	}		
}
