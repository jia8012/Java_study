package jicheng;

public class Animal {
    int color;
    int numberOfLegs;

    Animal() {
        color = 0;
        numberOfLegs = 1;
    }

    public void scream(){
        System.out.println("Animal");
    }

    public void jiao() {
        System.out.println("我是一个动物");
    }
}
