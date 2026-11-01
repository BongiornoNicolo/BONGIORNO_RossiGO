package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Noleggio {
    private Utente utente;
    private Veicolo veicolo;
    private LocalDateTime orarioinizio;
    private LocalDateTime orariofine;

    public Noleggio(Utente utente, Veicolo veicolo, LocalDateTime orarioinizio, LocalDateTime orariofine) {
        this.utente = utente;
        this.veicolo = veicolo;
        this.orarioinizio = orarioinizio;
        this.orariofine = orariofine;
    }
}
