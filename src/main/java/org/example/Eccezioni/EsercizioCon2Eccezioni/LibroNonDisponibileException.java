package org.example.Eccezioni.EsercizioCon2Eccezioni;

public class LibroNonDisponibileException extends Exception{
    public LibroNonDisponibileException(String messaggio){
        super(messaggio);
    }
}
