package org.example.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] nomi = {"Stella", "Luca", "Anna"};

        int[] voti = new int[3]; // 3 caselle
        voti[0] = 25;
        voti[1] = 30;
        voti[2] = 18;

        for (int i = 0; i < voti.length; i++) {
            System.out.println("Voto " + i + ": " + voti[i]);
        }

        System.out.println("------------------------------------------------");

        for (int voto : voti) {
            System.out.println("Voto: " + voto);
        }
        System.out.println("------------------------------------------------");

        /// ArrayList

        ArrayList<String> nomii = new ArrayList<>();
        nomii.add("Stella");
        nomii.add("Pandy");
        nomii.add("Topo");

        for (String nome : nomii) {
            System.out.println(nome);
        }

        System.out.println("------------------------------------------------");

        for (int i = 0; i < nomii.size(); i++) {
            System.out.println("Elemento " + i + ": " + nomii.get(i));
        }


        nomii.remove("Pandy"); // Rimuove per valore
        nomii.remove(0); // Rimuove per indice
        nomii.set(0, "Sorcetto");// Modifica elemento all’indice 0

        System.out.println("----------------------------------------------------------------");





    }
}
