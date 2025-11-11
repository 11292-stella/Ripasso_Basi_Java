package org.example.Eccezioni.RuntimeExceptionUnchecked;

public class ServizioRuntime {
    public void esegui(int valore){
        if(valore < 0){
            throw new RuntimeException("Valore negativo non ammesso");

        }
        System.out.println("Valore accettato: " + valore);
    }
}
