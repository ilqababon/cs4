package pizza;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredients> ingredientList;
    private double initialPrice, sellingPrice;
    static protected ArrayList<Recipe> recipeList = new ArrayList<>();

    public Recipe(String name, ArrayList<Ingredients> i, double initial) {
        this.name = name;
        this.ingredientList = i;
        this.initialPrice = initial;
        sellingPrice = 0;
        for (Ingredients ing : i) {
            sellingPrice += ing.getPrice();
        }
        recipeList.add(this);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Ingredients> getIngredientList() {
        return ingredientList;
    }
    public double getInitialPrice() {
        return initialPrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public static ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public static Recipe selectRecipe(String n) {
        for (Recipe i : recipeList) {
            if (i.getName().equals(n)) {
                return i;
            }
        }
        return null;
    }
    
}
