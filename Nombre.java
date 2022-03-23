package p4.ceja;

public class Nombre {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre(String nombre) {
        String[] esp = nombre.trim().split("\\s+");
        this.primerNombre = esp[0];
        this.segundoNombre = esp[1];
        this.primerApellido = esp[2];
        this.segundoApellido = esp[3];
    }

    @Override
    public String toString() {
        return "Nombre{"
                + "primerNombre=" + primerNombre
                + ", segundoNombre=" + segundoNombre
                + ", primerApellido=" + primerApellido
                + ", segundoApellido=" + segundoApellido
                + '}';
    }

    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
