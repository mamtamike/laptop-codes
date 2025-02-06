package Inheritance;

public class Derived2 extends Base1 {
	public Derived2() {
		//super(0); //to run argument constructor from base1 class
		System.out.println("I am derived constructor");
		y=56;
	}
	public Derived2(int a , int b) {
		super(a);
		System.out.println("I am derived overloaded with value b: " +b);
	}
	
private int y;
public void sety(int y) {
	this.y=y;
}
public int gety() {
	return y;
}
}
