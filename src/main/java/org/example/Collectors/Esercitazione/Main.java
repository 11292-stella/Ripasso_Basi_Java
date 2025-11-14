package org.example.Collectors.Esercitazione;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Libri> libro = List.of(
                new Libri("Return","Alan Wake","Horror",81),
                new Libri("Iniziation","Thomas Zane","Horror",81),
                new Libri("Storia di un topo","Topella","Fantasy",32),
                new Libri("Dorian Gray","Oscar Wilde","Fantasy",107),
                new Libri("Le avventure di PU!","Topella","fantasy",129),
                new Libri("Misery non deve morire","Stephen King","Horror",138),
                new Libri("Dov'è il mio formaggio?","Topella","Horror",81)

        );

        // lista raggruppata per vendite
       Map<Integer,List<Libri>> perVendite = libro.stream().collect(Collectors.groupingBy(Libri::getCopieVendute));
        System.out.println("Libri raggruppati per vendite");
        perVendite.forEach((copie, listaLibri) -> {
            System.out.println("   Copie vendute: " + copie);
            listaLibri.forEach(l -> System.out.println("      - " + l));
        });

        System.out.println("-------------------------------------------------------");

         //Lista raggruppata per autore
        Map<String, List<Libri>> perAutore = libro.stream().collect(Collectors.groupingBy(Libri::getAutore));
        System.out.println("Libri raggruppati per autore");
        perAutore.forEach((autore, listaLibri) -> {
            System.out.println("  Autore: " + autore);
            listaLibri.forEach(l -> System.out.println("      - " + l));
        });

        System.out.println("------------------------------------------------");
        //Lista raggruppata per genere
        Map<String,List<Libri>> perGenere = libro.stream().collect(Collectors.groupingBy(Libri::getGenere));
        System.out.println("Libri raggruppati per genere");
        perGenere.forEach((genere, libris) ->{
            System.out.println("   Genere: "+ genere);
            libris.forEach(libri -> System.out.println("      - " + libri));
        } );

        System.out.println("------------------------------------------------------");
        //Lista raggruppata per autore, genere, libri venduti

        Map<String, Map<String, Map<Integer, List<Libri>>>> perGruppo = libro.stream()
                .collect(Collectors.groupingBy(
                        Libri::getAutore, // primo livello: autore
                        Collectors.groupingBy(
                                Libri::getGenere, // secondo livello: genere
                                Collectors.groupingBy(Libri::getCopieVendute) // terzo livello: copie vendute
                        )
                ));
        System.out.println("Libri raggruppati per Aut,Gen,Ven");
        perGruppo.forEach((autore, generiMap) -> {
            System.out.println("Autore: " + autore);
            generiMap.forEach((genere, venditeMap) -> {
                System.out.println("   Genere: " + genere);
                venditeMap.forEach((copie, listaLibri) -> {
                    System.out.println("      Copie vendute: " + copie);
                    listaLibri.forEach(l -> System.out.println("         - " + l));
                });
            });
        });





    }
}
