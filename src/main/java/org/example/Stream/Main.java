package org.example.Stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Uno Stream è una sequenza di dati su cui puoi applicare operazioni come:
//
//        filter() → filtra elementi
//
//        map() → trasforma elementi
//
//        sorted() → ordina
//
//        collect() → raccoglie il risultato
//
//        forEach() → esegue un’azione su ogni elemento

        List<Studente> studenti = List.of(
                new Studente("Stella",7),
                new Studente("Peppe",8),
                new Studente("Mario",4),
                new Studente("Luigi",2),
                new Studente("Daisy",10)
        );

        System.out.println("Studenti promossi (ordinati per voto)");

        studenti.stream()
                .filter(studente -> studente.getVoto() >=6)
                .sorted((s1,s2)-> Integer.compare(s2.getVoto(),s1.getVoto()))
                .map(Studente::getNome)
                .forEach(System.out::println);







    }
}
