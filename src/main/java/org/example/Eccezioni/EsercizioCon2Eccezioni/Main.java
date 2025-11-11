package org.example.Eccezioni.EsercizioCon2Eccezioni;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws LibroNonDisponibileException {
        Biblioteca a = new Biblioteca(List.of("Primo"));
        Biblioteca b = new Biblioteca(List.of("Secondo"));
        Biblioteca c = new Biblioteca(List.of("terzo"));
        

        // Caso 1: titolo nullo o vuoto (unchecked)
        try {
            a.prestaLibro("");
        } catch (TitoloNonValidoException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (LibroNonDisponibileException e) {
            // non serve qui, ma lo mettiamo per completezza
        }

        // Caso 2: titolo non presente (checked)
        try {
            b.prestaLibro("LibroInesistente");
        } catch (TitoloNonValidoException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (LibroNonDisponibileException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // Caso 3: titolo valido
        try {
            String prestato = c.prestaLibro("terzo");
            System.out.println("Libro prestato: " + prestato);
        } catch (TitoloNonValidoException | LibroNonDisponibileException e) {
            System.out.println("Errore: " + e.getMessage());
        }







    }
}
