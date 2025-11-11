package org.example.Eccezioni.SimulazioneDueEccezioni;

public class SaldoInsufficienteException extends Exception{
    public SaldoInsufficienteException(String messaggio){
        super(messaggio);
    }
}
