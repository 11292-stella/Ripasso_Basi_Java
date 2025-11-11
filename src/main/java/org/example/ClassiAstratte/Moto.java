package org.example.ClassiAstratte;

public class Moto extends Veicolo{
    public Moto(String marca, String modello) {
        super(marca, modello);
    }

    @Override
    public String SuonMotore() {
        return "Brrrrrr!";
    }
}
