package org.example.CosèUnOggettoUnaClasseUnMetodo.PrimaCreazioneClasseConCostruttoEMetodi;

public class Main {
    public static void main(String[] args) {

        //Richiamo il costruttore con parametri con Operatore New
        //L’operatore new è alla base di Java. Permette di creare un’istanza
        //a partire da una classe. L’istanza sarà memorizzata nello heap
        //della memoria principale.
        // Il new per creare l’oggetto deve invocare il costruttore della classe
        //che si desidera istanziare.

        SuonoAnimale suono1 = new SuonoAnimale("Gracchia", "Strilla", "Fischia");
        SuonoAnimale suono2 = new SuonoAnimale("Grugnisce", "Gratta", "Ride");
        SuonoAnimale suono3 = new SuonoAnimale("Sniffa", "Sbuffa", "Soffia");

        Animale ani = new Animale("Grakky2", "Rapace", suono1);
        Animale an2 = new Animale("Marika", "Maiale", suono2);
        Animale an3 = new Animale("Bunny", "Coniglio", suono3);

        System.out.println(ani.descrizioneConSuono());
        System.out.println(an2.descrizioneConSuono());
        System.out.println(an3.descrizioneConSuono());
    }
}
