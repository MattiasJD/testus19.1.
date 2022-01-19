package com.company;

public enum Maso {
    KURE(0,0),
    STEAK(0,0),
    SALAM(0,0);

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

    Maso(int cena, int pocet) {
        this.cena = cena;
        this.pocet = pocet;
    }
}
