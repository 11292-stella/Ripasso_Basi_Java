package org.example.Conversioni.Variabili;

public class Main {
    public static void main(String[] args) {
        int eta = 28;
        double altezza = 1.65;
        boolean isStudente = true;
        char iniziale = 'S';
        String saluto = "Benvenuta nel ripasso Java!";

        System.out.println("Età: " + eta);
        System.out.println("Altezza: " + altezza);
        System.out.println("Studente: " + isStudente);
        System.out.println("Iniziale: " + iniziale);
        System.out.println(saluto);

        System.out.println("-------------------------------------------------");

        int a = 5;
        int b = 3;
        int somma = a + b;
        System.out.println("La somma è: " + somma);
        System.out.println("---------------------------------------------------------");

        int differenza = a - b;
        System.out.println("La differenza è: " + differenza);

        System.out.println("--------------------------------------------------");

        int divisione = a / b;
        System.out.println("La divisione è: " + divisione);

        System.out.println("--------------------------------------------------------");

        double x = 5;
        double y = 3;
        double risultato = x / y;
        System.out.println("Divisione decimale: " + risultato);

        System.out.println("-----------------------------------------------------");

        int resto = a % b;
        System.out.println("Il resto è: " + resto);



    }


}
