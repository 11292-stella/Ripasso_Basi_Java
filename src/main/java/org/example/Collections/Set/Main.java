package org.example.Collections.Set;

public class Main {
    public static void main(String[] args) {

        //Insieme non ordinato, senza duplicati

        Evento evento = new Evento();
        evento.aggiungiIscritto("Stella");
        evento.aggiungiIscritto("Topella");
        evento.aggiungiIscritto("Puccio");
        evento.aggiungiIscritto("Walter");
        evento.aggiungiIscritto("Peter");
        evento.aggiungiIscritto("Gennaro");
        evento.aggiungiIscritto("Stella");

        evento.stampaIscritti();

        evento.rimuoviIscritto("Stella");
        evento.rimuoviIscritto("BOBO");

        evento.stampaIscritti();
    }
}
