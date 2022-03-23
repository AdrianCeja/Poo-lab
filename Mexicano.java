package p4.ceja;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Mexicano {

    private Date fechaNacimiento;
    private Nombre nombre;
    private String entidadNacimiento;
    private String genero;
    private final String estatus;

    private static final DateFormat fecha = new SimpleDateFormat("dd.MM.yyyy");

    public Mexicano(String nombre, String genero, String fechaNacimiento, String entidad, String estatus) throws ParseException {
        this.nombre = new Nombre(nombre);
        this.genero = genero;
        this.entidadNacimiento = entidad;
        this.fechaNacimiento = Mexicano.fecha.parse(fechaNacimiento);
        this.estatus = estatus;
    }

    public Mexicano(Scanner sc) throws ParseException {
        System.out.println("\tIntroduce los datos solicitados\n");
        System.out.println("Nombre completo: (Si no se tiene segundo nombre ingrese Null después del primer nombre)");
        System.out.print(">> ");
        this.nombre = new Nombre(sc.nextLine());

        System.out.println("Genero (H/M): ");
        System.out.print(">> ");
        this.genero = sc.nextLine();

        System.out.println("Entidad de nacimiento: ");
        System.out.print(">> ");
        this.entidadNacimiento = sc.nextLine();

        System.out.println("Fecha de nacimiento (dd.MM.yyyy): ");
        System.out.print(">> ");
        this.fechaNacimiento = Mexicano.fecha.parse(sc.nextLine());

        System.out.println("Estatus migratorio: ");
        System.out.print(">> ");
        this.estatus = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Mexicano{"
                + "fechaNacimiento=" + fechaNacimiento
                + ", nombre=" + nombre
                + ", entidadNacimiento=" + entidadNacimiento
                + ", genero=" + genero
                + ", estatus=" + estatus
                + '}';
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEntidadNacimiento() {
        return entidadNacimiento;
    }
    public void setEntidadNacimiento(String entidadNacimiento) {
        this.entidadNacimiento = entidadNacimiento;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Nombre getNombre() {
        return nombre;
    }
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
