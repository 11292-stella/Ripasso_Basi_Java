package org.example.poliforme.esercizioPoly;

public class Fetta extends MezzoDiTrasporto{
    public Fetta(String marca, String modella) {
        super(marca, modella);
    }

    @Override
    public String muoviti() {
        return "A peto!!";
    }
}
