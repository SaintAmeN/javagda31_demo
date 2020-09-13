package com.javagda34.decorator;

import java.util.ArrayList;
import java.util.List;

public final class Pizza implements IPizza {
    private List<String> ingredients = new ArrayList<>();

    public Pizza() {
        this.ingredients.add("Ser");
        this.ingredients.add("Sos");
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
