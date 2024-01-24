package pizza;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Player {
    static private double money;
    static protected ArrayList<Ingredients> currentIngredients = new ArrayList<>();
    static private ArrayList<Recipe> ownedRecipes = new ArrayList<Recipe>();
    static private ArrayList<Customer> unlockedCustomers = new ArrayList<Customer>();

    // getters
    static public ArrayList<Recipe> getOwnedRecipes() {
        return ownedRecipes;
    }
    static public ArrayList<Customer> getUnlockedCustomers() {
        return unlockedCustomers;
    }
    static public double getMoney() {
        return money;
    }

    // buy recipe
    static public void buyRecipe(Recipe r) {
        if (r.getInitialPrice() > money) {
            System.out.println("You do not have enough money to buy " + r.getName());
        }
        else {
            ownedRecipes.add(r);
            money -= r.getInitialPrice();
            System.out.println("The recipe for " + r.getName() + " Pizza has been unlocked");
        }
    }

    // earn money
    static public void earnMoney(double m) {
        money += m;
    }

    // view customer info
    static public void viewCustomerInfo(Customer c) {
        System.out.println("Name: " + c.getName());
        System.out.println("Favoriate Recipe: " + c.getFavRecipe());
    }

    // view recipe
    static public void viewRecipe(Recipe r) {
        System.out.println("Name: " + r.getName());
        for (Ingredients ing : r.getIngredientList()) {
            System.out.println(ing.getName());
        }
        System.out.println("Selling Price: " + r.getSellingPrice());
        System.out.println("Initial Price: " + r.getInitialPrice());
    }

    // calculate cost of ingredients
    static public double ingredientCost(ArrayList<Ingredients> currentIngredients) {
        double cost = 0;
        for (Ingredients i : currentIngredients) {
            cost += i.getPrice();
        }
        return cost;
    }

    // calculate cost of pizza
    static public double pizzaCost(double i, Recipe r) {
        double cost = 0;
        cost += i; // ingredientCost;
        cost += r.getSellingPrice();
        return cost;
    }

    static public void makePizza(String input, Scanner sc, ArrayList<Ingredients> currentIngredients, Recipe currentRecipe) {
            System.out.println("\nIf finished, input 'Done'");
            System.out.println("Note: You must input ingredients in the correct order");
            while (!input.equals("Done")) {
              System.out.print("What ingredient will you add? ");
              input = sc.nextLine();
              currentIngredients.add(Ingredients.selectIngredients(input));
            }

            currentIngredients.removeAll(Collections.singleton(null));

            System.out.println("\nThe pizza is being baked.");

            System.out.println("You give the pizza to the customer. \n");

            // customer checks if pizza matches order
            double moneyEarned = Customer.checkRecipe(currentIngredients, currentRecipe);
            if (money + moneyEarned < 0) {
                money = 0;
            }
            else {
                earnMoney(moneyEarned);
            }

            currentIngredients.clear();
    }
}