package com.javagda34.factory.money;

public abstract class MoneyFactory {
    public static Money create5zl(){
        return new Money(5.0, "PLN");
    }

    public static Money create5usd(){
        return new Money(5.0, "USD");
    }
}
