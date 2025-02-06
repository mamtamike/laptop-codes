package PolymorphismMethodOverriding;

public class Cat extends Animal{
//@override  here method name and signature are same but implementation are different in parent it is "animal make sound" but in child it is "cat meows" so output here will be cat meows because method is overriden
	
		public static void main(String[] args) {
		Cat c=new Cat();
	c.makeNoise();
		}	
    public void makeNoise() {
	System.out.println("cat meows");
	}
}
