package org.example.ClassiAstratte;

import org.example.ClassiAstratte.Veicolo;

public class Auto extends Veicolo {
    public Auto(String marca, String modello) {
        super(marca, modello);
    }

    @Override
    public String SuonMotore() {
        return "Che succede amico!";
    }
}
