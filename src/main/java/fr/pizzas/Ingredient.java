package fr.pizzas;

public class Ingredient {
    private double price;
    private int calorie;
    private String name;

    public Ingredient withPrice(double price) {
        this.price = price;
        return this;
    }

    public Ingredient withCalorie(int calorie) {
        this.calorie = calorie;
        return this;
    }

    public Ingredient withName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public int getCalorie() {
        return calorie;
    }

    public String getName() {
        return name;
    }
}
