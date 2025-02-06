package Inheritance;

public class Truck extends Vehicle {
	public static void main(String[] args) {
		Truck Tk=new Truck();   //to inherit parent class method we don't need to instantiate parent class here.
		Tk.start();
		Tk.stop();
		Tk.loadCapacity();
	}
	public void loadCapacity() {
		System.out.println("load capacity");
	}

}
