package org.example.CosèUnOggettoUnaClasseUnMetodo.PrimaCreazioneClasseConCostruttoEMetodi;

public class SuonoAnimale extends Suoni{
    public SuonoAnimale(String primosuono, String secondosuono, String terzosuono) {
        super(primosuono, secondosuono, terzosuono);
    }

    public String suoniFatti (){
        return primo() + secondo() + terzo();
    }
}
