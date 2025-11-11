package org.example.Eccezioni.ExceptionChecked;

public class Main {
    public static void main(String[] args) {
        ServizioChecked s = new ServizioChecked();

        try {
            s.esegui(-5);
        } catch (ErroreChecked e) {
            System.out.println("Errore: " + e.getMessage());
        }

        //Eccezione con Exception (checked)
        //✅ Caratteristiche:
        //È checked → devi usare throws nel metodo
        //Devi gestirla con try-catch oppure propagare
    }


}
