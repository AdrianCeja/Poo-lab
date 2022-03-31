package p5.ceja;
/*
    Adrian Ceja Álvarez
    Práctica 5
 */
import b.Banco;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc;

        Banco b = new Banco();

        System.out.print("\tPrograma de operaciones bancarias\n\n");
        do {
            System.out.print("\n");
            System.out.println(" (1) - Crear cuenta");
            System.out.println(" (2) - Acceder a una cuenta");
            System.out.println(" (3) - Retirar");
            System.out.println(" (4) - Depositar");
            System.out.println(" (5) - Consultar saldo");
            System.out.println(" (6) - Cerrar sesion");
            System.out.println(" (7) - Salir");
            System.out.print(" >> ");

            opc = sc.next().charAt(0);

            switch (opc) {
                case '1' -> b.registroCuenta(CapturaDatos.capturaCuenta());
                case '2' -> b.iniciarSesion(CapturaDatos.capturaString("\nNumero de cuenta"), CapturaDatos.capturaString("Nip"));
                case '3' -> b.retirar(CapturaDatos.capturaFloat("\n Cuanto desea retirar?"));
                case '4' -> b.depositar(CapturaDatos.capturaFloat("\n Cuanto desea depositar?"));
                case '5' -> b.consultarSaldo();
                case '6' -> b.cerrarSesion();
            }
        }
        while(opc != '7');
        System.out.println("Que tengas un buen dia");
    }
}
