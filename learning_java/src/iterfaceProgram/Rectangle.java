package iterfaceProgram;

public class Rectangle implements Shapes{
	public static void main(String[] args) {
		Rectangle re=new Rectangle();
		re.drawShape();
		re.moveShape();
		re.colorShape();
	}

	@Override
	public void drawShape() {
		System.out.println("draw rectangle");	
	}

	@Override
	public void colorShape() {
		System.out.println("color rectangle");	
	}

	@Override
	public void moveShape() {
		System.out.println("move rectangle");	
	}
}
