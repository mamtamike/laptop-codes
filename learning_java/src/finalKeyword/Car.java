package finalKeyword;

public class Car extends vehicle{
	public static void main(String[] args) {
		Car obj= new Car();
		obj.vehicleSpeed();
	
	}
	
	@override
	public void vehicleSpeed() {
		System.out.println("speed increase");
	}

}
