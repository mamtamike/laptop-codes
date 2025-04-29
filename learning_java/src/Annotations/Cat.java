package Annotations;

public class Cat extends Animal {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Cat c = new Cat();
        c.makeNoise();
        c.sum(5, 7);
    }

    // Override annotation ensures correct method overriding , while overriding method name signature can be same but implementation is different in child class
    @Override
    public void makeNoise() {
        System.out.println("cat meow");
    }

    // Marking this method as deprecated
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}
