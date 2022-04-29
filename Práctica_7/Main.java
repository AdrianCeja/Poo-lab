package ceja;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        int opc;
        while(true) {
            System.out.println("1) - Jugar \n2) - Birds \n3) - Salir");
            System.out.print(" >> ");
            opc = scan.nextInt();

            switch (opc){
                case 1 -> Play.jugar();
                case 2 -> {BirdsArreglo.array(); BirdsArreglo.mostrarArray();}
                case 3 -> {System.out.println("\n Hasta luego!\n"); System.exit(117);}
                default -> throw new IllegalStateException("Unexpected value: " + opc);
            }
        }
    }
}

class Bird {
    int rango;
    int damage;
    String peso;
    String color;
    String nombre;

    Bird(String nombre, String color, int damage, int rango, String peso) {
        this.peso = peso;
        this.rango = rango;
        this.color = color;
        this.damage = damage;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRango() {
        return rango;
    }

    public String getColor() {
        return color;
    }

    public int getDamage() {
        return damage;
    }

    public String getPeso() {
        return peso;
    }

    void velocity() {
        int x, min=1, max=10;
        Random random = new Random();
        x = random.nextInt(max - min) + min;

        System.out.println(getNombre()+ " Tiró con una velocidad de "+x);
    }

    void atack() {
        int x, min=0, max=95;
        Random random = new Random();
        x = random.nextInt(max - min) + min;

        System.out.println(getNombre()+ " Atacó con un daño de "+x);
    }

    void impacto() {
        Random random = new Random();
        boolean x = random.nextBoolean();
        if(x)
            System.out.println("Impacto confirmado");
        else
            System.out.println("Impacto fallado");
    }
}

class Kat extends Bird {
    Kat(String nombre, String color, int damage, int rango, String peso) {
        super(nombre, color, damage, rango, peso);
        this.nombre = "Kat";
    }

    void Ultimate() {
        System.out.println("El pajaro "+getNombre()+" aumentó su daño y velocidad!");
    }
}

class Chuck extends Bird {
    Chuck(String nombre, String color, int damage, int rango, String peso) {
        super(nombre, color, damage, rango, peso);
        this.nombre = "Chuck";
    }

    void Ultimate() {
        System.out.println("El pajaro "+getNombre()+" ha aumentado su rango x3!");
    }
}

class Pug extends Bird {
    Pug(String nombre, String color, int damage, int rango, String peso) {
        super(nombre, color, damage, rango, peso);
        this.nombre = "Pug";
    }

    void Ultimate() {
        System.out.println("El pajaro "+getNombre()+" se ha multiplicado en 5!");
    }
}

class Play {
    static Kat kat = new Kat("Kat", "Naranja", 95, 3, "XS");
    static Pug pug = new Pug("Pug", "Café", 55, 6, "M");
    static Chuck chuck = new Chuck("Chuck", "Negro", 70, 5, "XXL");

    static void jugar() {
        System.out.println();
        kat.atack();
        kat.velocity();
        kat.impacto();
        kat.Ultimate();
        System.out.println();
        pug.atack();
        pug.velocity();
        pug.impacto();
        pug.Ultimate();
        System.out.println();
        chuck.atack();
        chuck.velocity();
        chuck.impacto();
        chuck.Ultimate();
        System.out.println();
    }
}

class BirdsArreglo {
    static Bird[] birdsA = new Bird[3];

    public static void array() {
        birdsA[0] = new Bird("Kat", "Naranja", 95, 3, "XS");
        birdsA[1] = new Bird("Pug", "Café", 55, 6, "M");
        birdsA[2] = new Bird("Chuck", "Negro", 70, 5, "XXL");
    }

    static void mostrarArray() {
        System.out.println("\n   --- Birds ---\n");

        for (Bird bird : birdsA) {
            System.out.println(" Nombre: "+bird.getNombre());
            System.out.println(" Color: "+bird.getColor());
            System.out.println(" Daño: "+bird.getDamage());
            System.out.println(" Rango: "+bird.getRango());
            System.out.println(" Peso: "+bird.getPeso()+"\n");
        }
    }
}
