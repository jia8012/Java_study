public class Pig extends Animal{
    String house;
    Pig(String house) {
        super(3,4);
        this.house = house;
    }

    public String  getHouse() {
        return house;
    }

    //public void scream() {
     //   System.out.println("哼哼");
   // }

    public void scream(String target) {
        System.out.println("哼哼 to " + target);
    }
    public static void main(String[] args) {
        Pig pig = new Pig("hotel");
        pig.scream("me");
        pig.scream();
        System.out.println(pig.getColor());
        System.out.println(pig.getNumberOfLegs());
        System.out.println(pig.getHouse());
    }
}
