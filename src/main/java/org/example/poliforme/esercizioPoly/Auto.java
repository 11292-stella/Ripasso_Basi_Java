package org.example.poliforme.esercizioPoly;

public class Auto extends MezzoDiTrasporto{
    public Auto(String marca, String modella) {
        super(marca, modella);
    }

    @Override
    public String muoviti() {
        return "a tutta velocità!!";
    }
}
