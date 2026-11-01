package org.example;

public abstract class Veicolo {
    public String codice;
    public double lvlbatteria;
    public boolean stato;

    public Veicolo(String codice, boolean stato, double lvlbatteria) {
        this.codice = codice;
        this.stato = stato;
        this.lvlbatteria = lvlbatteria;
    }

    abstract double calcolaCosto(int minuti);
    abstract double consumoBatteriaPerMinuto();

    public String GetCodice(){
        return codice;
    }

    public abstract boolean GetStato();
    public abstract double GetLvlbatteria();

}