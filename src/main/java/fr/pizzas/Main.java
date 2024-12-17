package fr.pizzas;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.setName("Test");
        pizzaBuilder.setTomatoBase(true);
        pizzaBuilder.setDoughThick(false);
        pizzaBuilder.setPrice(5);
        IngredientBuilder ingredientBuilder = new IngredientBuilder();
        Set<Ingredient> cheezeList = new HashSet<>();
        Set<Ingredient> seasoningList = new HashSet<>();
        Set<Ingredient> proteinList = new HashSet<>();
        for (int i = 0; i < 12; i++) {
            ingredientBuilder.setCalorie(i * 2);
            ingredientBuilder.setName("Ingredient " + i);
            ingredientBuilder.setPrice(i + 10);
            Ingredient ingredient = ingredientBuilder.build();
            if (i < 5) {
                seasoningList.add(ingredient);
            } else if (i < 10) {
                cheezeList.add(ingredient);
            } else {
                proteinList.add(ingredient);
            }
        }
        pizzaBuilder.setCheezeList(cheezeList);
        pizzaBuilder.setProteinList(proteinList);
        pizzaBuilder.setSeasoningList(seasoningList);
        Pizza pizza = pizzaBuilder.build();

        System.out.println(pizza.getCalories());
        System.out.println(pizza.getPrice());
        System.out.println(pizza.isTomatoBase());
    }
}