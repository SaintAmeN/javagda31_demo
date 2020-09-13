package com.javagda34.factory.money;

public class Money {
    private double value;
    private String currency;

    Money(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static Money create10PLN(){
        return new Money(10.0, "PLN");
    }

    public static class Obiekty{
        public Obiekty() {
        }
    }
}
