package fr.pizzas;

public class IngredientBuilder {
    private String name;
    private int calorie;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredient build() {
        Ingredient ingredient = new Ingredient().withCalorie(calorie).withName(name).withPrice(price);
        return ingredient;
    }
}
