package fr.pizzas;

import java.util.Set;

public class Pizza {
    private String name;
    private int calories;
    private double price;
    private int cookingHeat;
    private int cookingDuration;
    private boolean isDoughThick;
    private boolean isTomatoBase;
    private Set<Ingredient> cheezeList;
    private Set<Ingredient> proteinList;
    private Set<Ingredient> seasoningList;

    public Pizza() {
        this.cookingDuration = 90;
        this.cookingHeat = 400;
    }

    public Pizza withName(String name) {
        this.name = name;
        return this;
    }

    public Pizza withIsDoughThick(boolean isDoughThick) {
        this.isDoughThick = isDoughThick;
        return this;
    }

    public Pizza withIsTomatoBase(boolean isTomatoBase) {
        this.isTomatoBase = isTomatoBase;
        return this;
    }

    public Pizza withCheezeList(Set<Ingredient> cheezeList) {
        this.cheezeList = cheezeList;
        return this;
    }

    public Pizza withProteinList(Set<Ingredient> proteinList) {
        this.proteinList = proteinList;
        return this;
    }

    public Pizza withSeasoningList(Set<Ingredient> seasoningList) {
        this.seasoningList = seasoningList;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public int getCookingHeat() {
        return cookingHeat;
    }

    public int getCookingDuration() {
        return cookingDuration;
    }

    public boolean isDoughThick() {
        return isDoughThick;
    }

    public boolean isTomatoBase() {
        return isTomatoBase;
    }

    public Set<Ingredient> getCheezeList() {
        return cheezeList;
    }

    public Set<Ingredient> getProteinList() {
        return proteinList;
    }

    public Set<Ingredient> getSeasoningList() {
        return seasoningList;
    }

    public void setName(String name) {
        this.name = name;
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

    public void incrementPrice(double amount) {
        this.price += amount;
    }

    public void incrementCalories(int amount) {
        this.calories += amount;
    }
}
