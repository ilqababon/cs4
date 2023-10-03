/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureNotes;

import java.util.Scanner;

/**
 *
 * @author PHOTON
 */
public class sept15 {

    /**
     * @param args the command line arguments
     */
    
    // static keyword means that a method is not attached to any objects, but is rather attached to the class
    public static void main(String[] args) {
        
        Person mark = new Person("Mark");
        Person nathan = new Person("Nathan", 33, 1000000);
        
        // System.out.println(mark.age); -- not possible since mark.age is private
        
        // parameter must be another object
        mark.setFriend(nathan);
        
        // Person instead of variable name since noOfPersons is static
        System.out.println(Person.getNoOfPersons());
        
        // September 15, 2023
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // String name = scan.next(); // can only read one string of characters, not including a space
        String name = scan.nextLine(); // can read the entire line. however, this is an issue when in a loop mostly
                                        // when you place it at the end of the other inputs (does not pass)
                                        // this can be fixed by using Integer.parseInt(scan.nextLine()) instead of scan.nextInt
                                        // so that all the inputs are first passed as strings
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        
        System.out.print("Enter your money: ");
        double money = scan.nextDouble();
        
        System.out.print("Hello.");
        System.out.println("Hi.");
        System.out.printf("Hello, my name is %s. I am %d years old. I have %.2f pesos \n", name, age, money);
    }
    
}