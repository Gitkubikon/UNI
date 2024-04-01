package com.streich;

class Ausgabe {
    public static void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl ein:");
    }

    public static void keineZahl() {
        System.out.println("Das ist keine gültige Zahl.");
    }

    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl muss zwischen 1 und 3 liegen.");
    }

    public static void menschGewinnt() {
        System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
    }

    public static void computerGewinnt() {
        System.out.println("Leider hat der Computer gewonnen.");
    }

    public static void zugNichtMoeglich() {
        System.out.println("Diese Anzahl an Hölzern kann nicht gezogen werden.");
    }

    public static void spielstand(int h) {
        System.out.println("Es liegen noch " + h + " Hölzer auf dem Tisch.");
    }

    public static void menschZug(int gezogen, int verbleibend) {
        System.out.println("Sie nehmen " + gezogen + " Hölzer und es bleiben noch " + verbleibend + " Hölzer übrig.");
    }

    public static void computerZug(int gezogen, int verbleibend) {
        System.out.println(
                "Der Computer nimmt " + gezogen + " Hölzer und es bleiben noch " + verbleibend + " Hölzer übrig.");
    }
}