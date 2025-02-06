package SuperKeyword;

public class Parent {
	public Parent() {
		System.out.println("I am constructor");
	}
	public Parent(int j) {
		System.out.println("integer constructor");
	}
	public Parent(int j, int k) {
		System.out.println("two integer constructor");
	}
	int i=23;
	String s="hee joo";
	
	public void getData() {
		System.out.println(i);
		System.out.println(s);
	}

}
