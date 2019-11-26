public class Human extends Animal {
    Human() {
        super(3,2);
    }
    @Override
    public void scream() {
        System.out.println("呵呵");
    }

    public void scream(String target) {
        System.out.println("呵呵 to " + target);
    }

    public static void sleep2() {
        System.out.println("我是 Human 的睡觉");
    }

    public static void main(String[] args) {
        Human man = new Human();
        man.scream();
        man.scream("me");
        sleep2();
        System.out.println(man.getColor());
        System.out.println(man.numberOfLegs);
        System.out.println(man.getClass());
    }
}
