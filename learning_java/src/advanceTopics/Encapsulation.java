package advanceTopics;

public class Encapsulation{
	private int length;
	    private int breadth;
		private int height;
		 
		 public void setBoxDimension(int l, int b, int h) 
		 {
			 if(l>=1 && b>=1 && h>=1) {
			 System.out.println("box created with dimensions "+l+" "+b+" "+h+" ");
		}
			 else {
				 System.out.println("invalid dimension");
			 }
		 }
public void setLength(int l) {
	if(l>=1) {
	length=l;	
}
	else {
		System.out.println("invlalid length");
	}

}
public void setheight(int h) {
	if(h>=1) {
	height=h;
	}
	else {
		System.out.println("invalid height");
	}
	
}
public void setBreadth(int b) {
	if(b>=1) {
	breadth=b;
	}
	else {
		System.out.println("invalid breadth");
	}
	
}
public int getbreadth(int b) {
	return breadth;
}
public int getLength(int l) {
	return length;
}
public int getheight(int h) {
	return height;
}
}
