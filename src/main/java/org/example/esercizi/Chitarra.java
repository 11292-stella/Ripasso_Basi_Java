package org.example.esercizi;

public class Chitarra extends StrumentoMusicale{
    public Chitarra(String strumento, String suono) {
        super(strumento, suono);
    }

    @Override
    public String tipoSuono() {
        return "suona figo";
    }
}
