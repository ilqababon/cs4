/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longtestP2;

import java.util.Scanner;

/**
 *
 * @author staff
 */
public class Main {
    public static void main(String[] args){
        // You are writing in the main method of the application. You may wish to copy-paste segments of the code as you're working on it to avoid the errors in the latter part of the file.
        
        // You've decided that there are generally 5 different types of expenses:
        // Food: 100 per unit
        // Livelihood: 150 per unit
        // Entertainment: 200 per unit
        // Transportation: 80 per unit
        // Misc: 50 per unit
        
        // Create instances of the indicated expenses. Assign them to variables exp1, exp2, exp3, etc.
        // Score: 5pts

        Expense exp1 = new Expense("Food", 100);
        Expense exp2 = new Expense("Livelihood", 150);
        Expense exp3 = new Expense("Entertainment", 200);
        Expense exp4 = new Expense("Transportation", 80);
        Expense exp5 = new Expense("Misc", 50);
        
        Scanner scan = new Scanner(System.in);
        Person joe = new Person("Joe");
        Person jane =  new Person("Jane");
        
        // For the remainder of the problem, simply replace the blank spaces with the appropriate code to make the application work.
        
        // Application will loop for as long as the total expenses are under 10000.
        while(Person.getTotalExpenses() < 10000){
            Person selectedPerson = null;
            System.out.print("Who will spend on an expense, Joe or Jane?");
            String name = scan.nextLine();
            
            switch(name){
                case "Joe":
                    selectedPerson = joe;
                    break;
                case "Jane":
                    selectedPerson = jane;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            
            Expense selectedExpense = null;
            System.out.printf("What expense will %s spend on? ", selectedPerson.getName());
            String activity =  scan.nextLine();
            
            switch(activity){
                case "Food":
                    selectedExpense = exp1;
                    break;
                case "Livelihood":
                    selectedExpense = exp2;
                    break;
                case "Entertainment":
                    selectedExpense = exp3;
                    break;
                case "Transportation":
                    selectedExpense = exp4;
                    break;
                case "Misc":
                    selectedExpense = exp5;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            
            // Expercted output: How long will <person's name> do <activity name>?
            System.out.printf("How many units of %s will %s buy? ", selectedExpense.getName(), selectedPerson.getName());
            int units =  Integer.parseInt(scan.nextLine());
            
            // The selected person will puchase the specified units of the selected expense.
            selectedPerson.spend(selectedExpense, units);
        }
        
        joe.evaluateExpenses();
        jane.evaluateExpenses();
        
    }
}
