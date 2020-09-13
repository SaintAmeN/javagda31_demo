package com.javagda34.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        PizzaDecorator pizzaDecorator = new PizzaDecorator(pizza);
        pizzaDecorator.addIngredient("Szynka");
        pizzaDecorator.addIngredient("Kurczak");
        pizzaDecorator.addIngredient("Bekon");

        System.out.println(pizzaDecorator.getIngredients());

        PizzaDecorator otherPizza = new PizzaDecorator(pizzaDecorator);

        IPizza p = Pizzeria.createHawajska();
        IPizza nowaUdekorowana = new PizzaDecorator(p, "Bekon");
    }
}
