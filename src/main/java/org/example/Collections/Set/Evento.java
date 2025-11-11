package org.example.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Evento {
    private Set<String> iscritti;

    public Evento() {
        this.iscritti = new HashSet<>();
    }

    public Set<String> getIscritti() {
        return iscritti;
    }

    public void setIscritti(Set<String> iscritti) {
        this.iscritti = iscritti;
    }

    public void aggiungiIscritto(String nome){
        if(iscritti.add(nome)){
            System.out.println(nome + " iscritto con successo");
        } else {
            System.out.println(nome + " è gia iscritto");
        }
    }

    public void rimuoviIscritto(String nome){
        if (iscritti.remove(nome)){
            System.out.println(nome + " rimosso");
        } else {
            System.out.println(nome + " non era iscritto");
        }


    }


    public void stampaIscritti() {
        System.out.println("Iscritti all'evento:");
        for (String nome : iscritti) {
            System.out.println("- " + nome);
        }
    }


}
