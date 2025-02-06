package advanceTopics;

public class ConstructorProgram {
	//default constructor
	public ConstructorProgram() {
		System.out.println("no argument constructor");
	}
	public ConstructorProgram(int i) {
		System.out.println("integer constructor ");
		
	}
	public ConstructorProgram(int x, String s) {
		System.out.println("integer string constructor");
	}
	public static void main(String[] args) {
		//ConstructorProgram cns=new ConstructorProgram();
		ConstructorProgram cns=new ConstructorProgram(3,"harry");
		//ConstructorProgram cns=new ConstructorProgram(3,);
		
	}

}
