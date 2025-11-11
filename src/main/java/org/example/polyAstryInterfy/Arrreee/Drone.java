package org.example.polyAstryInterfy.Arrreee;

public class Drone extends Veicolo implements Autonomo,Elettrico{
    public Drone(String marca, String anno) {
        super(marca, anno);
    }

    @Override
    public String guidaDaSolo() {
        return "Il Marikozzo pensa sia un UFO";
    }

    @Override
    public String ricarica() {
        return "Il marikozzo mangia anche stavolta!";
    }

    @Override
    public String avviaMotore() {
        return "Il drone si rompe alla vista della chiappa del marikozzo";
    }
}
