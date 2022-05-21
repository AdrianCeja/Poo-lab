package ceja;

public class Veterinarian {
    private final String name;
    private final int salary;
    private final String speciality;

    public Veterinarian(String name, int salary, String speciality) {
        this.name = name;
        this.salary = salary;
        this.speciality = speciality;
    }

    public void checkRutine() {
        System.out.println(name+" está haciendo el chequeo de rutina");
    }

    public void medicine() {
        System.out.println(name+" está inyectando medicina");
    }

    public void wash() {
        System.out.println(name+" está bañando al animal");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSpeciality() {
        return speciality;
    }
}
