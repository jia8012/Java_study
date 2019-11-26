public class UpperCase {
    public static void main(String[] args) {
        Animal p1 = new Dog("Tom");
        Animal p2 = new Pig("house");
        Animal p3 = new Human();
        p1.scream();     //汪汪
        p2.scream();     //吱吱
        p3.scream();     //呵呵

        Animal.sleep2();
        Dog.sleep2();

        ((Human)p3).scream("我");
    }
}
