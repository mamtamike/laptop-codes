package AbstractionProgram;

public class CallAbstractMethod {
	public static void main(String[] args) {
		//Parent p= new Parent(); //error
		Child ch=new Child();
		ch.greet();
		//Child1 c=new Child1(); //error
	}

}
