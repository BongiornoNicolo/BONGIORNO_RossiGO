package org.example;

public class Utente {
    private String id;
    private String nome;
    private String email;
    private String codicefiscale;
    private double credito;     //in euro

    public Utente(String id, String nome, String email, String codicefiscale, double credito) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.codicefiscale = codicefiscale;
        this.credito = credito;
    }

    public String GetCodiceFiscale(){
        return codicefiscale;
    }

    public String GetId(){
        return id;
    }
    public double GetCredito(){
        return credito;
    }
    public String GetEmail(){
        return email;
    }
}
