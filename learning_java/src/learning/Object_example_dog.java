package learning;

public class Object_example_dog {
	    String name;
	    int age;

	    void bark() {
	        System.out.println(name + " says Woof!");
	    }
	

	    public static void main(String[] args) {
	        Object_example_dog myDog = new Object_example_dog();   // Creating an object
	        myDog.name = "Buddy";
	        myDog.age = 3;
	        myDog.bark();            // Calling a method
	    }
	}



