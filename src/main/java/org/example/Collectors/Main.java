package org.example.Collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Studenti> studenti = List.of(
                new Studenti("Stella",8),
                new Studenti("Marika",5),
                new Studenti("Mario",7),
                new Studenti("Luigi",4),
                new Studenti("Genoveffo",2),
                new Studenti("Benelardo",6),
                new Studenti("Marika",5)
        );

        //1. toList()
        List<Studenti> lista = studenti.stream().toList();
        System.out.println("Lista completa:");
        lista.forEach(System.out::println);

        System.out.println("------------------------------------");

        //2. toSet()
        Set<String> nomiUnici = studenti.stream()
                .map(Studenti::getNome)
                .collect(Collectors.toSet());
        System.out.println("Nomi unici (Set): "+ nomiUnici);

        System.out.println("------------------------------------");

        //3. joining()
        String nomiConcatenati = studenti.stream()
                .map(Studenti::getNome)
                .collect(Collectors.joining("$ "));
        System.out.println("Nomi concatenati: " + nomiConcatenati);

        System.out.println("------------------------------------");

        //4. counting()
        long numeroStudenti = studenti.stream()
                .collect(Collectors.counting());
        System.out.println("Numero totale di studenti: " + numeroStudenti);

        System.out.println("------------------------------------");

        //5. averagingInt()
        double mediaVoti = studenti.stream()
                .collect(Collectors.averagingInt(Studenti::getVoto));
        System.out.println("Media voti: " + mediaVoti);

        System.out.println("------------------------------------");

        //6. summarizingInt()
        IntSummaryStatistics stats = studenti.stream()
                .collect(Collectors.summarizingInt(Studenti::getVoto));
        System.out.println("Statistiche voti");
        System.out.println("   min:   "+ stats.getMin());
        System.out.println("   max:   "+ stats.getMax());
        System.out.println("   Somma: "+ stats.getSum());
        System.out.println("   Media: "+stats.getAverage());
        System.out.println("   Count  "+ stats.getCount());

        System.out.println("------------------------------------");

        //7. groupingBy()
        Map<Integer, List<Studenti>> perVoto = studenti.stream()
                .collect(Collectors.groupingBy(Studenti::getVoto));
        System.out.println("Studenti raggruppati per voto:");
        perVoto.forEach((voto, gruppo) ->{
            System.out.println("   Voto " + voto + ": " + gruppo);
        } );

        System.out.println("------------------------------------");

        //8. partitioningBy()
        Map<Boolean,List<Studenti>> promossiBocciati = studenti.stream()
                .collect(Collectors.groupingBy(studenti1 -> studenti1.getVoto() >= 6));
        System.out.println(" ✅ Promossi:");
        promossiBocciati.get(true).forEach(System.out::println);
        System.out.println(" ❌ Bocciati: ");
        promossiBocciati.get(false).forEach(System.out::println);










    }
}
