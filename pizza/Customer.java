package pizza;

import java.util.Random;
import java.util.ArrayList;

public class Customer {
    private String name;
    private Recipe chosenRecipe, favRecipe;
    static protected ArrayList<Customer> customerList = new ArrayList<>();

    public Customer(String name, Recipe favRecipe) {
        this.name = name;
        this.favRecipe = favRecipe;
        customerList.add(this);
    }

    // getters
    public String getName() {
        return name;
    }
    public Recipe getChosenRecipe() {
        return chosenRecipe;
    }
    public Recipe getFavRecipe() {
        return favRecipe;
    }
    public static ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    // pick recipe
    public void pickRecipe() {
        ArrayList<Recipe> recipeList = Player.getOwnedRecipes();
        Random random = new Random();
        int i = random.nextInt((recipeList.size() - 1) + 1);
        chosenRecipe = recipeList.get(i);
    }

    // checks recipe
    static public double checkRecipe(ArrayList<Ingredients> current, Recipe recipe) {
        if (current.equals(recipe.getIngredientList())) {
            System.out.println("Thank you for the pizza!");
            return recipe.getSellingPrice() + 100;
        }
        else {
            System.out.println("You got my order wrong :(");
            return 0.8*recipe.getSellingPrice();
        }
    }
}
