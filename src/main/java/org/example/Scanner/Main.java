package org.example.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // crea lo scanner

        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine(); // legge una riga di testo

        System.out.println("Ciao " + nome + "!");

        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt(); // legge un intero

        System.out.println("Hai inserito: " + numero);

        System.out.println("--------------------------------------------------");

        ArrayList<String> parole = new ArrayList<>();
        parole.add("formaggio");
        parole.add("cacca");
        parole.add("puzze");

        input = new Scanner(System.in);

        System.out.print("Inserisci una parola da cercare: ");
        String parolaDaCercare = input.nextLine();

        if (parole.contains(parolaDaCercare)) {
            System.out.println("La parola '" + parolaDaCercare + "' è presente nella lista!");
        } else {
            System.out.println("La parola '" + parolaDaCercare + "' NON è presente nella lista.");
        }

        input.close();

    }
}
