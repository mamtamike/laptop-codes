package Inheritance;

public class Base1 {
	public Base1(){
		System.out.println("I am constructor");
		x=12;
	}
	public Base1(int a) {
		
		System.out.println("I am overloaded constructor with value a: " +a);
	}
	private int x;
	
	public void setx(int x) {
		this.x=x;
	}
	public int getx() {
		return x;
	}	

}
