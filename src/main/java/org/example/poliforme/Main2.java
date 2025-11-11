package org.example.poliforme;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){
        ArrayList<Animali> animalis = new ArrayList<>();
        animalis.add(new Cane("Joy", "Volpina"));
        animalis.add(new Gatto("Catty", "Gattopardo"));
        animalis.add(new Topo("Topella","Topo de topis nano"));

        for (Animali a : animalis){
            System.out.println(a.getNome() + " (" + a.getRazza() + ") dice: " + a.parla());
        }
    }
}
