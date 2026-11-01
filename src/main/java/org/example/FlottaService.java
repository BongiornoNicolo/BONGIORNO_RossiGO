package org.example;

import java.util.ArrayList;
import java.util.List;

public class FlottaService {
    private List<Veicolo> veicoli;
    private List<Utente> utenti;
    private List<Noleggio> noleggiattivi;

    //istanzio tutto sul costruttore🥀🥀
    public FlottaService() {
        this.veicoli = new ArrayList<>();
        this.utenti = new ArrayList<>();
        this.noleggiattivi = new ArrayList<>();
    }


    //REGISTRA VEICOLO

    //uso i metodi dell'arraylist
    public void registraVeicolo(Veicolo v){
        veicoli.add(v);
    }

    //REGISTRA UTENTE

    //oggetto utente
    public void registraUtente(Utente u) throws CodiceFiscaleNonValidoException{
        //se true allora risulta valido, altrimenti entro nell'if
        boolean cfvalido= it.kamaladafrica.codicefiscale.CodiceFiscale.isFormatValid(u.GetCodiceFiscale());

        //se il cf non è valido genera l'eccezione, altrimenti aggiunge un oggetto utente all'arraylist utenti (dichiarata all inizio)
        if(cfvalido ==false){
            throw new CodiceFiscaleNonValidoException("il CF non è valido");
        }
        else
        {
            utenti.add(u);
        }
    }

    //SBLOCCA VEICOLO

    //se lancia 1+ eccezioni --> throws Eccezione A, Eccezione B, ...
    public void sbloccaVeicolo(String codice, String idUtente) throws CreditoInsufficienteException, VeicoloNonDisponibileException, BatteriaScaricaException{

        //oggetti dove metto poi gli oggetti trovati
        Veicolo veicoloTrovato = null;
        Utente utenteTrovato = null;

        //cerco le variabili inserite intanto nelle arraylist rispettive
        for(Veicolo v : veicoli){
            if(v.GetCodice().equals(codice)){
                veicoloTrovato=v;
                break;  //esco dal ciclo direttamente
            }
        }

        for(Utente u : utenti){
            if(u.GetId().equals(idUtente)){
                utenteTrovato=u;
                break;  //esco dal ciclo direttamente
            }
        }

        //ECCEZIONE --> NOCREDITO
        if(utenteTrovato.GetCredito() < 1.0){
            throw new CreditoInsufficienteException("Poraccio non tieni abbastanza soldi");
        }

        //ECCEZIONE --> VEICOLONONDISPONIBILE
        if(veicoloTrovato.GetStato() == false){
            throw new VeicoloNonDisponibileException("Veicolo occupato!");
        }

        //ECCEZIONE --> BATTERIAINSUFFICIENTE
        if(veicoloTrovato.GetLvlbatteria() < 20){
            throw new BatteriaScaricaException("Livello batteria troppo basso per l'utilizzo");
        }

        //se tutto cio avviene allora possono noleggiare effettivamente il veicolo
        veicoloTrovato.stato = false;
        System.out.println("Veicolo "+ codice+ " noleggiato con successo!");



    }

}
