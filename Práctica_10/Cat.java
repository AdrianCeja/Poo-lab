package ceja;

public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" está comiendo Purina Cat Chow!");
    }

    @Override
    public void sound() {
        System.out.println(getName()+" meoOoOowWw");
    }

    @Override
    public void playing() {
        System.out.println(getName()+" está jugando con un ratón");
    }
}
