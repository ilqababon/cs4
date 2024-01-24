package pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    // create ingredients
    // sauce
    Ingredients garlicSauce = new Ingredients("Garlic", "Sauce", 200);
    Ingredients marinaraSauce = new Ingredients("Marinara", "Sauce", 150);
    Ingredients barbecueSauce = new Ingredients("Barbecue", "Sauce", 250);
    // cheese
    Ingredients mozzarella = new Ingredients("Mozzarella", "Cheese", 75);
    Ingredients ricotta = new Ingredients("Ricotta", "Cheese", 100);
    Ingredients parmesan = new Ingredients("Parmesan", "Cheese", 50);
    Ingredients gorgonzola = new Ingredients("Gorgonzola", "Cheese", 100);
    // toppings
    Ingredients pepperoni = new Ingredients("Pepperoni", "Toppings", 40);
    Ingredients basil = new Ingredients("Basil", "Toppings", 20); // set prices
    Ingredients ham = new Ingredients("Ham", "Toppings", 40);
    Ingredients pineapple = new Ingredients("Pineapple", "Toppings", 30);
    Ingredients sausage = new Ingredients("Sausage", "Toppings", 50);
    Ingredients bacon = new Ingredients("Bacon", "Toppings", 35);
    Ingredients onion = new Ingredients("Onion", "Toppings", 30);
    Ingredients mushroom = new Ingredients("Mushroom", "Toppings", 35);
    Ingredients bellPepper = new Ingredients("Bell Pepper", "Toppings", 30);
    Ingredients olives = new Ingredients("Olives", "Toppings", 20);
    Ingredients spinach = new Ingredients("Spinach", "Toppings", 30);
    Ingredients chicken = new Ingredients("Chicken", "Toppings", 50);
    Ingredients nuts = new Ingredients("Nuts", "Toppings", 20);
    Ingredients shrimp = new Ingredients("Shrimp", "Toppings", 60);
    Ingredients scallops = new Ingredients("Scallops", "Toppings", 65);

    // create ingredients array lists
    ArrayList<Ingredients> fourCheeseIng = new ArrayList<Ingredients>();
    fourCheeseIng.add(garlicSauce);
    fourCheeseIng.add(mozzarella);
    fourCheeseIng.add(ricotta);
    fourCheeseIng.add(parmesan);
    fourCheeseIng.add(gorgonzola);

    ArrayList<Ingredients> pepperoniIng = new ArrayList<Ingredients>();
    pepperoniIng.add(marinaraSauce);
    pepperoniIng.add(mozzarella);
    pepperoniIng.add(pepperoni);

    ArrayList<Ingredients> margheritaIng = new ArrayList<Ingredients>();
    margheritaIng.add(marinaraSauce);
    margheritaIng.add(mozzarella);
    margheritaIng.add(basil);

    ArrayList<Ingredients> hawaiianIng = new ArrayList<Ingredients>();
    hawaiianIng.add(marinaraSauce);
    hawaiianIng.add(mozzarella);
    hawaiianIng.add(ham);
    hawaiianIng.add(pineapple);

    ArrayList<Ingredients> meatLoversIng = new ArrayList<Ingredients>();
    meatLoversIng.add(marinaraSauce);
    meatLoversIng.add(mozzarella);
    meatLoversIng.add(pepperoni);
    meatLoversIng.add(ham);
    meatLoversIng.add(sausage);
    meatLoversIng.add(bacon);
    meatLoversIng.add(parmesan);

    ArrayList<Ingredients> ultimateIng = new ArrayList<Ingredients>();
    ultimateIng.add(marinaraSauce);
    ultimateIng.add(mozzarella);
    ultimateIng.add(onion);
    ultimateIng.add(mushroom);
    ultimateIng.add(bellPepper);
    ultimateIng.add(olives);
    ultimateIng.add(pepperoni);
    ultimateIng.add(sausage);
    ultimateIng.add(bacon);
    ultimateIng.add(parmesan);

    ArrayList<Ingredients> seafoodIng = new ArrayList<Ingredients>();
    seafoodIng.add(marinaraSauce);
    seafoodIng.add(mozzarella);
    seafoodIng.add(nuts);
    seafoodIng.add(shrimp);
    seafoodIng.add(scallops);

    ArrayList<Ingredients> spinachBaconIng = new ArrayList<Ingredients>();
    spinachBaconIng.add(garlicSauce);
    spinachBaconIng.add(spinach);
    spinachBaconIng.add(bacon);
    spinachBaconIng.add(mozzarella);

    ArrayList<Ingredients> bbqChickenIng = new ArrayList<Ingredients>();
    bbqChickenIng.add(barbecueSauce);
    bbqChickenIng.add(mozzarella);
    bbqChickenIng.add(chicken);
    bbqChickenIng.add(onion);
    bbqChickenIng.add(bacon);

    ArrayList<Ingredients> xanirisIng = new ArrayList<Ingredients>();
    xanirisIng.add(garlicSauce);
    xanirisIng.add(bacon);
    xanirisIng.add(ham);
    xanirisIng.add(mozzarella);
    xanirisIng.add(bellPepper);
    xanirisIng.add(parmesan);

    // create pizza recipes
    Recipe fourCheesePizza = new Recipe("Four Cheese", fourCheeseIng, 5000); // set prices
    Recipe pepperoniPizza = new Recipe("Pepperoni", pepperoniIng, 500);
    Recipe margheritaPizza = new Recipe("Margherita", margheritaIng, 0);
    Recipe hawaiianPizza = new Recipe("Hawaiian", hawaiianIng, 1000);
    Recipe meatLoversPizza = new Recipe("Meat Lovers", meatLoversIng, 7500);
    Recipe ultimatePizza = new Recipe("Ultimate", ultimateIng, 20000);
    Recipe seafoodPizza = new Recipe("Seafood", seafoodIng, 10000);
    Recipe spinachBaconPizza = new Recipe("Spinach & Bacon", spinachBaconIng, 12500);
    Recipe bbqChickenPizza = new Recipe("BBQ Chicken", bbqChickenIng, 35000);
    Recipe xanirisPizza = new Recipe("Xaniris", xanirisIng, 50000);

    // create all customers
    Customer c1 = new Customer("c1", pepperoniPizza);
    Customer c2 = new Customer("c2", fourCheesePizza);
    Customer c3 = new Customer("c3", margheritaPizza);
    Customer c4 = new Customer("c4", hawaiianPizza);
    Customer c5 = new Customer("c5", pepperoniPizza);

    // current customer, current recipe, current ingredients on pizza
    Customer currentCustomer = null;
    Recipe currentRecipe = null;
    ArrayList<Ingredients> currentIngredients = Player.currentIngredients;
    Player.buyRecipe(margheritaPizza);

    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("Exit")) {

        // customer selects pizza
        Random random = new Random();
        int i = random.nextInt((Customer.customerList.size() - 1) + 1);
        currentCustomer = Customer.customerList.get(i);
        currentCustomer.pickRecipe();

        // Scenario between customer and player
        System.out.println("I am " + currentCustomer.getName() + " and I want to order a " + currentCustomer.getChosenRecipe().getName() + " pizza");
        currentRecipe = currentCustomer.getChosenRecipe();

        System.out.println("You have received the order for the pizza, and you should be able to replicate it. \n");
        
        // Pizza making screen
        System.out.println("What will the customer do?");
        System.out.println("Pizza - Make pizza");
        System.out.println("Recipe - View recipes");
        System.out.println("Buy - Buy new recipes");
        System.out.println("Money - Check current balance");
        System.out.println("Exit - Exit application");

        input = sc.nextLine();

        switch (input) {
          case ("Pizza"):
            Player.makePizza(input, sc, currentIngredients, currentRecipe);
            break;

          case ("Recipe"):
            System.out.println("What recipe do you want to view?");
            input = sc.nextLine();
            Recipe viewedRecipe = Recipe.selectRecipe(input);
            Player.viewRecipe(viewedRecipe);
            Player.makePizza(input, sc, currentIngredients, currentRecipe);
            break;
          
          case ("Buy"):
            System.out.println("What will you buy?");
            input = sc.nextLine();
            Recipe selectedRecipe = Recipe.selectRecipe(input);
            Player.buyRecipe(selectedRecipe);

            Player.makePizza(input, sc, currentIngredients, currentRecipe);
            break;
          
          case ("Money"):
            System.out.println("Your current balance: " + Player.getMoney());
            Player.makePizza(input, sc, currentIngredients, currentRecipe);
        }

    }

    sc.close();
  }
}
