package ceja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        Torneo torneo = new Torneo();

        int i = 0, j= 0, k = 0, opc = 0;

        while(true) {
            System.out.print("\n 1) - Agregar Torneo \n 2) - Agregar Equipo \n 3) - Agregar jugadores \n 4) - Mostrar Detalles\n 5) - Salir\n >> ");
            opc = scan.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.print("\n Ingresa el nombre del Torneo\n >> ");
                    torneo.nombreTorneo = scan.next();
                    System.out.print("\n Ingresa el nombre de la region\n >> ");
                    torneo.nombreRegion = scan.next();
                    i++;
                }
                case 2 -> {
                    if(i != 0) {
                        System.out.println();
                        torneo.agregarEquipo(CapturarDatos.getString(" Nombre del equipo"), CapturarDatos.getString(" Division"),
                                CapturarDatos.getString(" Nombre del entrenador"), CapturarDatos.getInt(" Torneos Jugados"),
                                CapturarDatos.getInt(" Torneos Ganados"), CapturarDatos.getInt(" Torneos Perdidos"));
                        j++;
                    }
                    else {
                        System.out.println("\n Primero crea un Torneo");
                    }
                }
                case 3 -> {
                    int c = 0;
                    System.out.println();
                    torneo.mostrarEquipos();
                    System.out.print(" Eliga el equipo del jugador\n >> ");
                    c = scan.nextInt();
                    torneo.getEquipos(c - 1).agregarJugadores(CapturarDatos.getString(" Nombre"), CapturarDatos.getString(" Numero de uniforme"),
                            CapturarDatos.getInt(" Puntos anotados"), CapturarDatos.getString(" Posicion de juego"), CapturarDatos.getString(" Estatura"));
                    k++;
                }
                case 4 -> {
                    if(i != 0 || j != 0 || k != 0) {
                        System.out.println();
                        torneo.mostrarTorneo();
                        System.out.println();
                        torneo.mostrarEquiposPuntos();
                    }
                    else {
                        System.out.println("--- Error - Introduzca primero los datos de Torneo, equipo o jugadores ---");
                    }
                }
                case 5 -> {
                    System.out.println("\n Hasta Luego!");
                    System.exit(26);
                }
                default -> System.out.println(" Ingrese una opcion valida");
            }
        }
    }
}

class Torneo {
    public String nombreTorneo;
    public String nombreRegion;
    private int numeroEquiposParticipantes = 0;
    private int partidosJugados = 0;
    private int partidosPendientes;
    private Equipo[] equipos = new Equipo[5];

    public void mostrarTorneo() {
        System.out.println(" Torneo\n------------------------------");
        System.out.println("El nombre del torneo es: "+ nombreTorneo);
        System.out.println("La region del torneo es: "+ nombreRegion);
        System.out.println("------------------------------");
    }

    public void agregarEquipo(String nombreEquipo, String division, String nombreEntrenador, int torneosParticipados,
                int torneosGanados, int torneosPerdidos) {
        if(numeroEquiposParticipantes < 5) {
            equipos[numeroEquiposParticipantes] = new Equipo(nombreEquipo, division, nombreEntrenador, torneosParticipados, torneosGanados, torneosPerdidos);
            numeroEquiposParticipantes++;
        }
    }

    public void mostrarEquipos() {
        int i = 1;

        System.out.println(" Equipos\n------------------------------");
        for(Equipo equipo: equipos) {
            if(equipo != null) {
                System.out.println(i+" - " +equipo.getNombreEquipo()+ "  |  Div. - " + equipo.getDivision());
                i++;
            }
        }
        System.out.println("------------------------------");
    }

    public void mostrarEquiposPuntos() {
        int i = 1;

        System.out.println(" Equipos\n------------------------------");
        for(Equipo equipo: equipos) {
            if(equipo != null) {
                System.out.println(i+" - " +equipo.getNombreEquipo()+ "  |  Div. - " + equipo.getDivision() + "  |  Puntos - "+ equipo.getPuntos());
                i++;
            }
        }
        System.out.println("------------------------------");
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public Equipo getEquipos(int i) {
        return equipos[i];
    }
}

class Equipo {
    public String nombreEquipo;
    public String division;
    private String nombreEntrenador;
    private int torneosParticipados;
    private int torneosGanados;
    private int torneosPerdidos;
    private int numJugadores = 0;
    private Jugador[] jugadores = new Jugador[10];

    public Equipo(String nombreEquipo, String division, String nombreEntrenador, int torneosParticipados, int torneosGanados, int torneosPerdidos) {
        this.nombreEquipo = nombreEquipo;
        this.division = division;
        this.nombreEntrenador = nombreEntrenador;
        this.torneosParticipados = torneosParticipados;
        this.torneosGanados = torneosGanados;
        this.torneosPerdidos = torneosPerdidos;
    }

    public void agregarJugadores(String nombre, String numeroUniforme, int puntosAnotados, String posicion, String estatura) {
        if(numJugadores < 10) {
            jugadores[numJugadores] = new Jugador(nombre, numeroUniforme, puntosAnotados, posicion, estatura);
            numJugadores++;
        }
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getDivision() {
        return division;
    }

    public int getPuntos() {
        int p = 0;

        for(Jugador jugador: jugadores) {
            if(jugador != null) p += jugador.getPuntosAnotados();
        }
        return p;
    }
}

class Jugador {
    private String numeroUniforme;
    private  String nombre;
    private int puntosAnotados;
    private String posicion;
    private String estatura;

    public Jugador(String numeroUniforme, String nombre, int puntosAnotados, String posicion, String estatura) {
        this.numeroUniforme = numeroUniforme;
        this.nombre = nombre;
        this.puntosAnotados = puntosAnotados;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

}

class CapturarDatos {
    public static String getString(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje + "\n >> ");
        return scanner.nextLine();
    }

    public static int getInt(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje + "\n >> ");
        return scanner.nextInt();
    }
}
