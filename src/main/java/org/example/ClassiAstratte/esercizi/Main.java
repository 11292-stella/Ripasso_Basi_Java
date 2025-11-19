package org.example.ClassiAstratte.esercizi;

public class Main {
    public static void main(String[] args) {
        StrumentoMusicale s = new Chitarra("chitarra", "strimpella");
        System.out.println("lo strumento " + s.getStrumento() + " fa:" + s.tipoSuono());

        StrumentoMusicale b = new Pianoforte("pianoforte", "fa qualcosa");
        System.out.println("lo strumento " + b.getStrumento() + " fa:" + b.tipoSuono());
    }
}
