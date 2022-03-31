package p5.ceja;
/*
    Adrian Ceja Álvarez
    Práctica 5
 */
import b.Cuenta;
import java.util.Scanner;

public class CapturaDatos {

    public static String capturaString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + " >> ");
        return sc.nextLine();
    }

    public static float capturaFloat(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + "\n >> ");
        return sc.nextFloat();
    }

    public static Cuenta capturaCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n --- Creacion de cuenta nueva ---");
        return new Cuenta(capturaString(" Nombre"), capturaString(" Nip"));
    }
}