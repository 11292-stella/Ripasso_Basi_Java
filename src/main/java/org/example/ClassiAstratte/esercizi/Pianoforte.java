package org.example.ClassiAstratte.esercizi;

public class Pianoforte extends StrumentoMusicale {
    public Pianoforte(String strumento, String suono) {
        super(strumento, suono);
    }

    @Override
    public String tipoSuono() {
        return "suona piano";
    }
}
