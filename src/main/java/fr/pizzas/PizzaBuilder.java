package fr.pizzas;

import java.util.Set;

public class PizzaBuilder {
    private String name;
    private double price;
    private boolean isDoughThick;
    private boolean isTomatoBase;
    private Set<Ingredient> cheezeList;
    private Set<Ingredient> proteinList;
    private Set<Ingredient> seasoningList;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDoughThick(boolean isDoughThick) {
        this.isDoughThick = isDoughThick;
    }

    public void setTomatoBase(boolean isTomatoBase) {
        this.isTomatoBase = isTomatoBase;
    }

    public void setCheezeList(Set<Ingredient> cheezeList) {
        this.cheezeList = cheezeList;
    }

    public void setProteinList(Set<Ingredient> proteinList) {
        this.proteinList = proteinList;
    }

    public void setSeasoningList(Set<Ingredient> seasoningList) {
        this.seasoningList = seasoningList;
    }

    public Pizza build() {
        if (cheezeList.size() > 5) {
            throw new IllegalArgumentException("Il y a trop de fromages, le maximum est de 5 !");
        }
        if (proteinList.size() > 5) {
            throw new IllegalArgumentException("Il y a trop de protéines, le maximum est de 5 !");
        }
        if (seasoningList.size() != 5) {
            throw new IllegalArgumentException("Il faut 5 assaisonements exactement !");
        }
        Pizza pizza = new Pizza()
                .withName(name)
                .withCheezeList(cheezeList)
                .withIsDoughThick(isDoughThick)
                .withIsTomatoBase(isTomatoBase)
                .withProteinList(proteinList)
                .withSeasoningList(seasoningList);

        pizza.incrementPrice(this.price);

        if (cheezeList.size() > 4) {
            pizza.setTomatoBase(false);
        }

        for (Ingredient ingredient : seasoningList) {
            this.incrementPizzaData(ingredient, pizza);
        }
        for (Ingredient ingredient : cheezeList) {
            this.incrementPizzaData(ingredient, pizza);
        }
        for (Ingredient ingredient : proteinList) {
            this.incrementPizzaData(ingredient, pizza);
        }

        return pizza;
    }

    private void incrementPizzaData(Ingredient ingredient, Pizza pizza) {
        pizza.incrementCalories(ingredient.getCalorie());
        pizza.incrementPrice(ingredient.getPrice());
    }
}
