package finalKeyword;

public class Cycle extends vehicle{
public static void main(String[] args) {
	final int speedTest=100; //variable now become constant cannot be increased
	speedTest++;
	System.out.println(speedTest);
}
}
