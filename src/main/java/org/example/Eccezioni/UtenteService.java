package org.example.Eccezioni;

public class UtenteService {
    public String cercaUtente(int id) throws UtenteNonTrovatoException{
        if (id != 1){
            throw new UtenteNonTrovatoException("Utente con ID "+ id + " non trovato");

        }
        return "Utente trovato: ID 1";
    }
}
