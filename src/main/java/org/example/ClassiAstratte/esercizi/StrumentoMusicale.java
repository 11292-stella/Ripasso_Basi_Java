package org.example.ClassiAstratte.esercizi;

public abstract class StrumentoMusicale {

    private String strumento;
    private String suono;

    public StrumentoMusicale(String strumento, String suono) {
        this.strumento = strumento;
        this.suono = suono;
    }

    public String getStrumento() {
        return strumento;
    }

    public void setStrumento(String strumento) {
        this.strumento = strumento;
    }

    public String getSuono() {
        return suono;
    }

    public void setSuono(String suono) {
        this.suono = suono;
    }

   public abstract  String tipoSuono();
}
