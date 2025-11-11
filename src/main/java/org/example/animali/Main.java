package org.example.animali;

public class Main {
    public static void main(String[] args) {
        SuonoAnimale suono1 = new SuonoAnimale("Gracchia", "Strilla", "Fischia");
        SuonoAnimale suono2 = new SuonoAnimale("Grugnisce", "Gratta", "Ride");
        SuonoAnimale suono3 = new SuonoAnimale("Sniffa", "Sbuffa", "Soffia");

        Animale ani = new Animale("Grakky2", "Rapace", suono1);
        Animale an2 = new Animale("Marika", "Maiale", suono2);
        Animale an3 = new Animale("Bunny", "Coniglio", suono3);

        System.out.println(ani.descrizioneConSuono());
        System.out.println(an2.descrizioneConSuono());
        System.out.println(an3.descrizioneConSuono());
    }
}
