package advanceTopics;

public class GetterSetter {
public static void main(String[] args) {
	Encapsulation en= new Encapsulation();
	en.setheight(10);
    en.setLength(20);
	en.setBreadth(30);
	en.setBoxDimension(10, 20, 30);
	
	System.out.println(en.getbreadth(0));
	System.out.println(en.getheight(0));
		System.out.println(en.getLength(0));
}
}
