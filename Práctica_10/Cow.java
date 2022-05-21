package ceja;

public class Cow extends Animal {
    public Cow(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" está comiendo pasto");
    }

    @Override
    public void sound() {
        System.out.println(getName()+" MuuuuUUUUuUuuu");
    }

    @Override
    public void playing() {
        System.out.println(getName()+" está corriendo libremente!");
    }
}
