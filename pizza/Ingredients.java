package pizza;

import java.util.ArrayList;

public class Ingredients {
    private String name, type;
    private double price;
    static private ArrayList<Ingredients> ingredientList = new ArrayList<>();

    public Ingredients(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        ingredientList.add(this);
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }

    public static Ingredients selectIngredients(String n) {
        for (Ingredients i : ingredientList) {
            if (i.getName().equals(n)) {
                return i;
            }
        }
        return null;
    }
}
