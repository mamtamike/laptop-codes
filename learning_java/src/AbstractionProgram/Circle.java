package AbstractionProgram;

public class Circle extends Shapes {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.colorShape();
		c.drawShape();
		c.moveShape();
		//Shapes sh=new Shapes(); //---error telling can not instantiate the abstract class
		//sh.colorShape();//error	
	}

	@Override
	public void drawShape() {
		System.out.println("drawing circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("cloring circle");
	}

	@Override
	public void moveShape() {
		System.out.println("moving circle");
	}

}
