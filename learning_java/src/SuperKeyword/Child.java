package SuperKeyword;

public class Child extends Parent {
	public Child() {
		//super(3);
		super(3,4);
	}
	int i=56;
	String s="yong kang";
	public void getDate() {
	//	super.getData();
		System.out.println(super.i);
		System.out.println(super.s);
	//	System.out.println(i);
	//	System.out.println(s);
	}
	public static void main(String[] args) {
		Child c=new Child();
		//c.getData();
		
	}
	

}
