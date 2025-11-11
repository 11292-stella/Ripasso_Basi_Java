package org.example.polyAstryInterfy.Arrreee;

public class AutoElettrica extends Veicolo implements Autonomo,Elettrico{
    public AutoElettrica(String marca, String anno) {
        super(marca, anno);
    }

    @Override
    public String guidaDaSolo() {
        return "Quando il veicolo vede la chiappa del marikozzo";
    }

    @Override
    public String ricarica() {
        return "Il marikozzo ricarica la macchina mangiando";
    }

    @Override
    public String avviaMotore() {
        return "Il veicolo non si avvia per il peso del marikozzo";
    }
}
