package org.example.interfacceEastrazione;

public class Main {
    public static void main(String[] args) {


        Robot a = new Robot("T-13", 2045);


        System.out.println(a.avvia());
        System.out.println(a.parla());
        System.out.println(a.pulisci());
    }
}
