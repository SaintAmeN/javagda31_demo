package com.javagda34.decorator;

public class Pizzeria {
    public static IPizza createQuattroFromaggia(){
        return new PizzaDecorator(new Pizza(), "Blue cheese", "Mozarella", "Cheddar", "Gouda");
    }
    public static IPizza createHawajska(){
        return new PizzaDecorator(new Pizza(), "Ananas");
    }
}
