package org.example;

public class Bici extends Veicolo{
    private int nmarce;

    public Bici(String codice, boolean stato, double lvlbatteria, int nmarce) {
        super(codice, stato, lvlbatteria);
        this.nmarce = nmarce;

    }

    public int GetNmarcetot(){
        return nmarce;
    }

    @Override
    double calcolaCosto(int minuti) {
        return minuti*0.15;
    }

    @Override
    double consumoBatteriaPerMinuto() {     //metto un numero a caso --> 0.5
        return 0.5;
    }

    @Override
    public boolean GetStato(){
        return stato;
    }

    @Override
    public double GetLvlbatteria() {
        return lvlbatteria;
    }


}