package org.example;

public class Monopattino extends Veicolo {
    private double velmax;

    public Monopattino(String codice, boolean stato, double lvlbatteria, double velmax) {
        super(codice, stato, lvlbatteria);
        this.velmax = velmax;
    }


    @Override
    double calcolaCosto(int minuti) {
        return minuti*0.25;
    }

    @Override
    double consumoBatteriaPerMinuto() {     //metto numero a caso scelto meggiore di quello di bici --> 1.2
        return 1.2;
    }

    //metodi secondari
    @Override
    public boolean GetStato(){
        return stato;
    }

    @Override
    public double GetLvlbatteria() {
        return lvlbatteria;
    }

    public double GetVelMaxCOnsentita(){
        return velmax;
    }
}
