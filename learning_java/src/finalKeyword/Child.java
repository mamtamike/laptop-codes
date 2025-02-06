package finalKeyword;

public class Child extends Parent {
	public final int i=250;
	public static void main(String[] args) {
		Child c=new Child();
		c.getData();
		//System.out.println(c.i);
		//error   c.i=20; 
		//System.out.println(c.i);
		
	}
	public void getData() {
		System.out.println(i);
	}
	
	
}
