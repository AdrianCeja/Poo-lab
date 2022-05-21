package ceja;

public class Lion extends Animal {
    public Lion(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" está comiendo una zebra!");
    }

    @Override
    public void sound() {
        System.out.println(getName()+" GrroAAaaRrr");
    }

    @Override
    public void playing() {
        System.out.println(getName()+" está jugando con sus crías");
    }
}
