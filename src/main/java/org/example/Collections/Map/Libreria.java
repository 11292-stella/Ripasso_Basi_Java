package org.example.Collections.Map;

import java.util.Map;

public class Libreria {
    private Map<String,Integer> inventario;

    public Libreria(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public Map<String, Integer> getInventario() {
        return inventario;
    }

    public void setInventario(Map<String, Integer> inventario) {
        this.inventario = inventario;
    }

    public void aggiungiLibro(String titolo, int copie){

        inventario.put(titolo,copie);
    }

    public void prestaLibro(String titolo) {
        if (inventario.containsKey(titolo)) {
            int copie = inventario.get(titolo);
            if (copie > 0) {
                inventario.put(titolo, copie - 1);
                System.out.println("Hai preso in prestito: " + titolo);
            } else {
                System.out.println("Nessuna copia disponibile per: " + titolo);
            }
        } else {
            System.out.println("Il libro non esiste in libreria: " + titolo);
        }
    }

    public void stampaInventario() {
        System.out.println("Inventario della libreria:");
        inventario.forEach((titolo, copie) ->
                System.out.println("- " + titolo + ": " + copie + " copie")
        );
    }


}
