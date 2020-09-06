package com.javagda34.strategy;

public class Bohater {
    private String imie;
    private IStrategiaWalki strategiaWalki;

    public Bohater(String imie) {
        this.imie = imie;
    }

    public void walcz(){
        strategiaWalki.walcz();
    }

    public void setStrategiaWalki(IStrategiaWalki strategiaWalki) {
        this.strategiaWalki = strategiaWalki;
    }
}
