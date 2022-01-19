package com.company;

public enum Zelenina {
    BRAMBORY(0,0),
    MRKEV(0,0),
    POREK(0,0);

    private int cena;
    private int pocet;

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getPocet() {
        return pocet;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    Zelenina(int cena, int pocet) {
        this.cena = cena;
        this.pocet = pocet;
    }
}
