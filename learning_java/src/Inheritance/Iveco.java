package Inheritance;

public class Iveco extends Truck{
	public static void main(String[] args) {
		Iveco Iv=new Iveco();
		Iv.loadCapacity(); //method from truck
		Iv.start(); //method from vehicle
		Iv.stop(); //method from vehicle
	}

}
