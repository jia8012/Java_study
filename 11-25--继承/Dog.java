package jicheng;

public class Dog extends Animal {
    String host;
    protected Dog(){
        super();
    }

    public void scream(){
        System.out.println("Dog");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.color);
        System.out.println(dog.numberOfLegs);
        System.out.println();
    }
}
