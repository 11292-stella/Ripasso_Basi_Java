package org.example.ClassiAstratte;

public class main {
    public static void main(String[] args) {
        Veicolo v1 = new Auto("Fiat", "Pandy");
        Veicolo v2 = new Moto("Yamaha", "R1");

        System.out.println(v1.getMarca() + " " + v1.getModello() + " fa:" + v1.SuonMotore());
        System.out.println(v2.getMarca() + " " + v2.getModello() + " fa:" + v2.SuonMotore());
    }
}
