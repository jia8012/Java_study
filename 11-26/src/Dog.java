public class Dog extends Animal{
    String host;

    Dog(String host) {
        super(2,4);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public void scream() {
        System.out.println("汪汪");
    }

    public void sleep() {
        System.out.println("我是 Dog 的睡觉");
    }

    public static void sleep2() {
        System.out.println("我是 Dog 的睡觉");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tom");
        dog.scream();
        dog.sleep();
        System.out.println(dog.getHost());
        System.out.println(dog.getColor());
        System.out.println(dog.getNumberOfLegs());
    }
}
