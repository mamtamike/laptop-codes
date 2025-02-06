package advanceTopics;

public class InvokeConstructor {
	public static void main(String[] args) {	
	MyConstructor ca =new MyConstructor("acd", 34);
	System.out.println(ca.getName());//we did not need to set name,id as we made constructor
	System.out.println(ca.getId());
	}	

}
