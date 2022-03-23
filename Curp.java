package p4.ceja;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Curp {

    private static boolean vocal(char aei) {
        return "aeiouAEIOU".indexOf(aei) != -1;
    }

    private static char primeraVocal(String aei) {
        for(char c: aei.toCharArray()) {
            if(vocal(c)) {
                return c;
            }
        }
        return ' ';
    }

    private static char segundaConsonante(String aei) {
        String bar = aei.substring(1);
        for(char c: aei.toCharArray()) {
            if(!vocal(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static String generar(Mexicano aei) {
        Nombre nombre = aei.getNombre();
        String genero = aei.getGenero();
        Date fecha = aei.getFechaNacimiento();
        String entidad = aei.getEntidadNacimiento();

        int min = 10, max = 99;
        int value = ThreadLocalRandom.current().nextInt(min, max) + min;

        char primerLetraPA = nombre.getPrimerApellido().charAt(0);
        char primerVocalPA = primeraVocal(nombre.getPrimerApellido());
        char primerLetraSA = nombre.getSegundoApellido().charAt(0);
        char primerLetraN = nombre.getPrimerNombre().charAt(0);

        int ano = fecha.getYear();
        int mes = fecha.getMonth() + 1;
        int dia = fecha.getDate();

        char segundaConsonanteP = segundaConsonante(nombre.getPrimerApellido());
        char segundaConsonanteS = segundaConsonante(nombre.getSegundoApellido());
        char segundaConsonanteN = segundaConsonante(nombre.getPrimerNombre());

        StringBuilder stbu = new StringBuilder();
        stbu.append(primerLetraPA);
        stbu.append(primerVocalPA);
        stbu.append(primerLetraSA);
        stbu.append(primerLetraN);
        stbu.append(String.format("%02d%02d%02d",ano ,mes ,dia));
        stbu.append(genero);
        stbu.append(entidad);
        stbu.append(segundaConsonanteP);
        stbu.append(segundaConsonanteS);
        stbu.append(segundaConsonanteN);
        stbu.append(String.format("%d",value));

        return stbu.toString().toUpperCase();
    }
}
