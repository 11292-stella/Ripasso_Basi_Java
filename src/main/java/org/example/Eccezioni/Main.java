package org.example.Eccezioni;

public class Main {
    public static void main(String[] args) {
        UtenteService service = new UtenteService();

        try {
            String risultato = service.cercaUtente(2);
            System.out.println(risultato);

        } catch (UtenteNonTrovatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
