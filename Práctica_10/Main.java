package ceja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        int opc;

        Zoo zoo = new Zoo();

        zoo.addAnimal(new Human("Adrian",20, "Blanco"));
        zoo.addAnimal(new Lion("Alistar",3, "Naranja"));
        zoo.addAnimal(new Lion("King",9, "Blanco"));
        zoo.addAnimal(new Cat("Iris",10, "Blanco, negro y naranja"));
        zoo.addAnimal(new Cow("Kyle",26, "Cafe"));

        zoo.addVeterinarian(new Veterinarian("Katherine", 10600,"Cirujia"));
        zoo.addVeterinarian(new Veterinarian("Kaleb", 5700,"Oncología"));
        zoo.addVeterinarian(new Veterinarian("Ryden", 4800,"Fisioterapia"));

        while(true) {
            System.out.print("\n 1 - Ver animales\n 2 - Añadir animal\n 3 - Eliminar animal\n 4 - Ver veterianrios\n 5 - Funciones\n 6 - Salir\n >> ");
            opc = in.nextInt();

            switch(opc) {
                case 1 -> {zoo.listAnimals();}
                case 2 -> {
                    int opc2;
                    System.out.print(" Qué animal desea agregar?\n 1 - Humano\n 2 - León\n 3 - Gato\n 4 - Vaca\n >> ");
                    opc2 = in.nextInt();
                    if(opc2==1)
                        zoo.addAnimal(addHuman());
                    else if(opc2==2)
                        zoo.addAnimal(addLion());
                    else if(opc2==3)
                        zoo.addAnimal(addCat());
                    else if(opc2==4)
                        zoo.addAnimal(addCow());
                    else
                        System.out.println("\n Error");
                }
                case 3 -> {
                    zoo.listAnimals();
                    zoo.deleteAnimal(Scan.getString("Nombre: "));
                    System.out.println("\n Eliminado correctamente");
                }
                case 4 -> {zoo.listVeterinarians();}
                case 5 -> {zoo.Funciones();}
                case 6 -> {
                    System.out.println("\n Hasta Luego!\n");
                    System.exit(26);
                }
                default -> System.out.println("\n Error\n");
            }
        }
    }

    public static Human addHuman() {
        return new Human(Scan.getString("Nombre: "),Scan.getInt("Edad: "),Scan.getString("Color: "));
    }

    public static Lion addLion() {
        return new Lion(Scan.getString("Nombre: "),Scan.getInt("Edad: "),Scan.getString("Color: "));
    }

    public static Cat addCat() {
        return new Cat(Scan.getString("Nombre: "),Scan.getInt("Edad: "),Scan.getString("Color: "));
    }

    public static Cow addCow() {
        return new Cow(Scan.getString("Nombre: "),Scan.getInt("Edad: "),Scan.getString("Color: "));
    }
}
