package org.example.Eccezioni.RuntimeExceptionUnchecked;

public class Main {

    public static void main(String[] args) {
        ServizioRuntime s = new ServizioRuntime();

        try{
            s.esegui(-5);
        } catch (RuntimeException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

//RuntimeException (non obbligatoria da gestire)
//✅ Caratteristiche:
//È unchecked → non serve throws nel metodo
//Puoi gestirla con try-catch, ma non sei obbligata
