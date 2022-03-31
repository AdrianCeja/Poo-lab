package b;

import java.util.Vector;
import java.util.stream.IntStream;
/*
    Adrian Ceja Álvarez
    Práctica 5
 */
public class Banco {

    public final static int INVALID_IDENTIFIER = -1;
    public final static int SESSION_ACTIVE = 1;
    public final static int SESSION_INACTIVE = 0;

    private final Vector<Cuenta> cuentaP = new Vector<>();

    private int registroSesion;

    public void registroCuenta(Cuenta foo) {
        cuentaP.add(foo);
    }

    public int verifyCuenta(String foo) {
        return IntStream.range(0, this.cuentaP.size()).filter(i -> this.cuentaP.get(i).getNumeroCuenta().equals(foo))
                .findFirst()
                .orElse(Banco.INVALID_IDENTIFIER);
    }

    public Cuenta datosCuenta() {
        return this.cuentaP.get(this.getRegistroSesion());
    }

    public void iniciarSesion(String foo, String nip) {
        this.setRegistroSesion(this.verifyCuenta(foo));
        if (this.getRegistroSesion() == Banco.INVALID_IDENTIFIER) return;
        if (this.datosCuenta().getNip().equals(nip)) {
            System.out.println("\n Cuenta de " + this.datosCuenta().getUsuario());
            System.out.println(" Estado de cuenta: " + this.datosCuenta().getSaldo() + " pesos");
        }
    }

    public void cerrarSesion() {
        this.setRegistroSesion(Banco.INVALID_IDENTIFIER);
        System.out.println(" Se ha cerrado sesion exitosamente\n");
    }

    public void depositar(float saldo) {
        if (this.getSessionStatus() != Banco.SESSION_ACTIVE) return;
        System.out.println(" Se ha depositado exitosamente\n");
        this.cuentaP.get(this.registroSesion).depositar(saldo);
    }

    public void retirar(float saldo) {
        if (this.getSessionStatus() != Banco.SESSION_ACTIVE) return;
        this.cuentaP.get(this.registroSesion).retirar(saldo);
    }

    public void consultarSaldo() {
        System.out.println("\n El saldo disponible es: " + this.datosCuenta().getSaldo() + " pesos");
    }

    public int getSessionStatus() {
        if (this.getRegistroSesion() == Banco.INVALID_IDENTIFIER) return Banco.SESSION_INACTIVE;
        return Banco.SESSION_ACTIVE;
    }

    public int getRegistroSesion() {
        return registroSesion;
    }

    public void setRegistroSesion(int registroSesion) {
        this.registroSesion = registroSesion;
    }
}
