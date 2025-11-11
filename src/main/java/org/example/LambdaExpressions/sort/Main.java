package org.example.LambdaExpressions.sort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Ordina con criterio personalizzato

        List<Studente> studenti = new ArrayList<>(List.of(
                new Studente("Stella",8),
                new Studente("Marika",3),
                new Studente("Mario",7),
                new Studente("Pippo",5)
        ));

        // Ordina per voto decrescente, poi per nome crescente
        studenti.sort((o1, o2) -> {
            if (o2.getVoto() != o1.getVoto()){
                return Integer.compare(o2.getVoto(), o1.getVoto());
            } else {
                return o1.getNome().compareToIgnoreCase(o2.getNome());
            }
        });

        System.out.println(" Lista ordinata");
        studenti.forEach(System.out ::println);


    }
}
