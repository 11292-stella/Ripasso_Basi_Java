package org.example.LambdaExpressions.removeIf;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Rimuove se condizione è vera

        List<Studenti> studenti = new ArrayList<>(List.of(
                new Studenti("Stella",9),
                new Studenti("Puccio", 10),
                new Studenti("Marika",0)
        ));

        System.out.println("Lista iniziale");
        studenti.forEach(System.out ::println);

        studenti.removeIf(studenti1 -> studenti1.getVoto() < 6);

        System.out.println(" Studenti promossi:");
        studenti.forEach(System.out ::println);


    }
}
