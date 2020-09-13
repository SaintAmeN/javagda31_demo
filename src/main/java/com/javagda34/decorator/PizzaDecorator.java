package com.javagda34.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaDecorator implements IPizza {
    private List<String> additionalIngredients = new ArrayList<>();
    private IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }
    public PizzaDecorator(IPizza pizza, String... ingredients) {
        this.pizza = pizza;
        this.additionalIngredients.addAll(Arrays.asList(ingredients));
    }

    public void addIngredient(String costam) {
        additionalIngredients.add(costam);
    }

    @Override
    public List<String> getIngredients() {
        List<String> allIngredients = new ArrayList<>();
        allIngredients.addAll(additionalIngredients);
        allIngredients.addAll(pizza.getIngredients());
        return allIngredients;
    }
}
