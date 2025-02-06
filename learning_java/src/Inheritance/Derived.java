package Inheritance;

public class Derived extends Base  {
	public static void main(String[] args) {
		Derived dr=new Derived();
		dr.callBase();
			}
	
	public void callBase() {  //by inheritance or extend keyword we can directly call the parent class method without creating object of parent class
		printMe();
		setx(2);
		System.out.println(getx());	
	}
}

