package advanceTopics;

public class ClassAA {
	public static void main(String[] args) {
		
		AccessModifier Ac = new AccessModifier();
		Ac.publicMethod();
		
		ClassAA ob = new ClassAA();
		ob.methodAA();	
	}
		public void methodAA(){
			System.out.println("MethodAA");
		}
}
