package com.streich;

class Spiel {
    private int streichhoelzer;

    public Spiel(int anzahl) {
        this.streichhoelzer = anzahl;

        // Entscheide zufällig, wer beginnt: 0 für den Computer, 1 für den Menschen
        int werBeginnt = (int) (Math.random() * 2);

        while (streichhoelzer > 0) {
            if (werBeginnt == 0) {
                computerZiehen();
                if (streichhoelzer <= 0) {
                    Ausgabe.menschGewinnt();
                    break;
                }
                werBeginnt = 1;
            }

            menschZiehen();
            if (streichhoelzer <= 0) {
                Ausgabe.computerGewinnt();
                break;
            }

            if (werBeginnt == 1) {
                werBeginnt = 0;
            }
        }
    }

    public void computerZiehen() {
        int ziehen = berechneComputerZug();
        streichhoelzer -= ziehen;
        Ausgabe.computerZug(ziehen, streichhoelzer);
    }

    public void menschZiehen() {
        int gezogen = Eingabe.leseHoelzer();
        if (gezogen > streichhoelzer) {
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        } else {
            streichhoelzer -= gezogen;
            Ausgabe.menschZug(gezogen, streichhoelzer);
        }
    }

    private int berechneComputerZug() {
        boolean machtOptimalenZug = Math.random() > 0.2; // 80% Chance für den optimalen Zug

        int ziel = (streichhoelzer - 1) % 4;

        if (!machtOptimalenZug) {
            int zufaelligerZug = (int) (Math.random() * 3) + 1;
            return zufaelligerZug == ziel ? zufaelligerZug % 3 + 1 : zufaelligerZug;
        } else if (ziel == 0) {
            return (int) (Math.random() * 3) + 1;
        } else {
            return ziel;
        }
    }
}