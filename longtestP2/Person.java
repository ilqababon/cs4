/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longtestP2;

/**
 *
 * @author staff
 */
public class Person {
    private final String name;
    private String receipts;
    private double expenses;
    private static double totalExpenses = 0;
    
    public Person(String name){
        this.name = name;
        this.receipts = "";
        this.expenses = 0;
    }
    public String getName(){
        return this.name;
    }
    public String getReceipts(){
        return this.receipts;
    }
    public double getExpenses(){
        return this.expenses;
    }
    public static double getTotalExpenses(){
        return totalExpenses;
    }
    public void spend(Expense item, int quantity){
        this.receipts += item.getName() + ": " + quantity + " unit(s)\n";
        // add code here such that:
        // the expenses of the person is increased by the cost and quantity of the item (as indicated by the parameters)
        double totalCost = item.getCost() * quantity;
        this.expenses += totalCost;
        // the total expenses of all persons is recorded and increased by the cost and quantity of the item
        totalExpenses += totalCost;
        // a statement is printed stating that: "<person's name> spent <total item's cost> on <item's name>
        System.out.printf("%s spent %.2f on %s %n", this.name, totalCost, item.getName());
        //Score: 4pts
    }
    public void evaluateExpenses(){
        // add code here such that:
        // it prints the receipts of the person
        System.out.print(this.receipts);
        // it prints the following depending on the percentage of expenses compated to the total expenses
        //      small spender: expenses are less than 15% of the total expenses
        //      moderate spender: expenses are greater than 15% of the total expenses but less than 30%
        //      big spender: expenses are greater than 30% of the total expenses but less than 50%
        //      majority spender: expenses are 50% or greater than the total expenses
        if (this.expenses < (0.15 * totalExpenses)) {
            System.out.printf("%s is a small spender %n", this.name);
        }
        else if ((this.expenses > (0.15 * totalExpenses)) && (this.expenses < (0.3 * totalExpenses))) {
            System.out.printf("%s is a moderate spender %n", this.name);
        }
        else if ((this.expenses > (0.3 * totalExpenses)) && (this.expenses < (0.5 * totalExpenses))) {
            System.out.printf("%s is a big spender %n", this.name);
        }
        else if ((this.expenses >= (0.5 * totalExpenses)) || (this.expenses > totalExpenses)) {
            System.out.printf("%s is a majority spender %n", this.name);
        }
    }
}
