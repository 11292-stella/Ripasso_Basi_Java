package org.example.Eccezioni.EsercizioCon2Eccezioni;

public class TitoloNonValidoException extends RuntimeException{
    public TitoloNonValidoException (String messaggio){
        super(messaggio);
    }
}
