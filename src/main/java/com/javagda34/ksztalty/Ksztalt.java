package com.javagda34.ksztalty;

import java.util.Objects;

public class Ksztalt {
    private String nazwa;
    private int rozmiar;

    private void printSomething() {
        System.out.println("Something");
    }

    protected void metoda() {
        printSomething();
    }

    public int obliczPole() {
        return 0;
    }

    public int obliczObwod() {
        return 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ksztalt ksztalt = (Ksztalt) o;
        return rozmiar == ksztalt.rozmiar &&
                Objects.equals(nazwa, ksztalt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, rozmiar);
    }
}
