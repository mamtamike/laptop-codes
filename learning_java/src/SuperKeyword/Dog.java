package SuperKeyword;

public class Dog extends Animal{
	String sound="bark bhoo";
	
	public void makeSound() {
		System.out.println("dog bark");
	}
	
	public void showSound() {
		System.out.println("Animal sound: " +super.sound); //to call variable of parent class if variable are same in both class parent and child
		System.out.println("Dog sound: " +this.sound);//to call variable of child class
		super.makeSound(); //when we override method from parent class super keyword is used to call method of parent class.
		this.makeSound();//this is used to call method of current or child class
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.showSound();
	}
}
