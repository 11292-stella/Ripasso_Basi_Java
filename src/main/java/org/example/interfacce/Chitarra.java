package org.example.interfacce;

public class Chitarra implements Accordabile{
    @Override
    public String accorda() {
        return "Accordo le corde manualmente";
    }
}
