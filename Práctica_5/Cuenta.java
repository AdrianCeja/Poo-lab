package b;
/*
    Adrian Ceja Álvarez
    Práctica 5
 */
public class Cuenta {

    private String nip;
    private float saldo;
    private static int id = 0;
    private final String usuario;
    private final String numeroCuenta;


    public Cuenta(String user, String nip) {
        this.usuario = user;

        this.nip = nip;
        this.numeroCuenta = Integer.toString(id++);
        this.saldo = 0f;
    }

    public void depositar(float saldo) {
        this.saldo += saldo;
    }

    public void retirar(float saldo) {
        if (this.saldo - saldo < 0) {
            System.out.println(" --- Saldo insuficiente ---");
        }
        else {
            this.saldo -= saldo;
        }
    }


    @Override
    public String toString() {
        return "Cuenta" + "usuario=" + usuario + ", nip=" + nip + ", numeroCuenta=" + numeroCuenta
                + ", saldo=" + saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public float getSaldo() {
        return saldo;
    }
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
