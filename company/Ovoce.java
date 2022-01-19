package com.company;

public enum Ovoce {
    JABLKO(0,0),
    HRUSKA(0,0),
    JAHODY(0,0);

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

    Ovoce(int cena, int pocet) {
        this.cena = cena;
        this.pocet = pocet;
    }
}
