package ceja;

public class Zoo {
    private Animal[] animals = new Animal[10];
    private final Veterinarian[] veterinarians = new Veterinarian[4];

    public void addAnimal(Animal j) {
        int i;
        for(i=0; i<animals.length; i++) {
            if(animals[i] == null) {
                animals[i] = j;
                break;
            }
        }
    }

    public void deleteAnimal(String name) {
        Animal[] animalsNew = new Animal[10];
        int i = 0;

        for(Animal animal : animals) {
            if(animal != null && !animal.getName().equalsIgnoreCase(name)) {
                animalsNew[i] = animal;
                i++;
            }
        }
        animals = animalsNew;
    }

    public void addVeterinarian(Veterinarian j) {
        int i;
        for(i=0; i<veterinarians.length; i++) {
            if(veterinarians[i] == null) {
                veterinarians[i] = j;
                break;
            }
        }
    }

    public void listAnimals() {
        int i = 1;
        for(Animal animal : animals) {
            if(animal != null) {
                System.out.println("\n--- Animal "+ i +" ---");
                System.out.println(" Nombre: " + animal.getName());
                System.out.println(" Edad: " + animal.getAge());
                System.out.println(" Color: " + animal.getColor());
                i++;
            }
        }
    }

    public void listVeterinarians() {
        int i = 1;
        for(Veterinarian veterinarian : veterinarians) {
            if(veterinarian != null) {
                System.out.println("\n--- Veterinario "+ i +" ---");
                System.out.println(" Nombre: " + veterinarian.getName());
                System.out.println(" Salario: " + veterinarian.getSalary());
                System.out.println(" Especialidad: " + veterinarian.getSpeciality());
                i++;
            }
        }
    }

    public void Funciones() {
        for(Animal animal : animals) {
            if(animal != null) {
                animal.eat();
                animal.sound();
                animal.playing();
            }
        }
        System.out.println();
        for(Veterinarian veterinarian : veterinarians) {
            if(veterinarian != null) {
                veterinarian.checkRutine();
                veterinarian.medicine();
                veterinarian.wash();
            }
        }
    }

}
