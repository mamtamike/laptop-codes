package JavaPractice;
import java.util.Scanner;


public class IfElseExercise {
	
	//check N is even or odd based on certain conditions

 public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);
	         System.out.println("enter number N");
	         int N = scanner.nextInt();
	         scanner.close();
	         
	         if(N%2!=0){
	            System.out.println("Weird");
	         }
	         else{
	            if(N>2 && N<5){
	                System.out.println("Not Weird");
	            }
	            else if(N>=6 && N<=20){
	                System.out.println("Weird");
	            }
	            else if(N>20){
	                System.out.println("Not Weird");
	            }
	         }
	         
	         }
	    }




