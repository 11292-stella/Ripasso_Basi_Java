package org.example.interfacceEastrazione;

public class Robot extends Macchina implements Parlante,Pulente{
    public Robot(String modello, int anno) {
        super(modello, anno);
    }

    @Override
    public String avvia() {
        return "Avvio sistema robotico...";
    }

    @Override
    public String parla() {
        return "Ciao, sono un robot!";
    }


    @Override
    public String pulisci() {
        return "Sto pulendo il pavimento!";
    }
}
