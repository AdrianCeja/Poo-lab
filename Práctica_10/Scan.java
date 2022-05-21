package ceja;

import java.util.Scanner;

public class Scan {
    public static String getString(String txt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(txt);
        return sc.nextLine();
    }

    public static int getInt(String txt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(txt);
        return sc.nextInt();
    }
}
