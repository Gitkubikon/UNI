package com.streich;

import java.util.Scanner;

class Eingabe {
    private static Scanner scanner = new Scanner(System.in);

    public static int leseZahl() {
        Ausgabe.zahlEingeben();
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl();
            return leseZahl();
        }
    }

    public static int leseHoelzer() {
        int zahl = leseZahl();
        if (zahl < 1 || zahl > 3) {
            Ausgabe.zahlNichtImBereich();
            return leseHoelzer();
        }
        return zahl;
    }
}
