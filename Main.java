package p4.ceja;

import java.util.Scanner;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        char opc;

        Mexicano m = new Mexicano(sc);

        do {
            System.out.println(" (1) - Capturar");
            System.out.println(" (2) - CURP");
            System.out.println(" (3) - RFC");
            System.out.println(" (4) - Mostrar");
            System.out.println(" (5) - Salir");
            System.out.print(" >> ");

            opc = sc.next().charAt(0);

            switch (opc) {
                case '1' -> m = new Mexicano(sc);
                case '2' -> System.out.println(Curp.generar(m));
                case '3' -> System.out.println(Rfc.generar(m));
                case '4' -> System.out.println(m);
                case '5' -> System.out.println("Hasta Luego!");
            }
        }
        while(opc != '5');
    }
}
