package org.example.LambdaExpressions.forEach;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Una lambda è una funzione anonima, cioè senza nome, che puoi passare come parametro.
        //(parametri) -> { corpo }

        List<Studente> studenti = List.of(
                new Studente("Stella", 8),
                new Studente("Luca", 5),
                new Studente("Marika", 7),
                new Studente("Giorgio", 4)
        );

        System.out.println("Studenti promossi:");
        studenti.forEach(s -> {
            if (s.getVoto() >= 6) {
                System.out.println(s);
            }
        });
    }
}

