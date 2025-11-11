package org.example.Eccezioni.SimulazioneDueEccezioni;

public class ImportoNonValidoException extends RuntimeException{
    public ImportoNonValidoException(String messaggio){
        super(messaggio);
    }
}
