package org.example.interfacce;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Accordabile> a = new ArrayList<>();
        a.add(new Chitarra());
        a.add(new PianoForte());

        for (Accordabile d : a){
            System.out.println("lo strumento dice: " + d.accorda());
        }
    }
}
