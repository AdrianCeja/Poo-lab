package p4.ceja;

public class Rfc {

    public static String generar(Mexicano aei) {

        return Curp.generar(aei).substring(0, 11);
    }
}
