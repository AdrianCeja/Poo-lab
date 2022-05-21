package ceja;

public class Human extends Animal {
    public Human(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" está comiendo una chocolate");
    }

    @Override
    public void sound() {
        System.out.println(getName()+" pongame 10 profe");
    }

    @Override
    public void playing() {
        System.out.println(getName()+" está jugando en su Pc Gamer");
    }
}
