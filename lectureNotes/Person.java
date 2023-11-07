package lectureNotes;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHOTON
 */
public class Person {
    // by default, all fields are private, aka these fields cannot be accessed outside of this class
    private String name;
    private int age;
    // allows subclasses and other classes in the package to access the variable
    protected double money;
    
    private Person friend;
    
    // static - a field that describes a class itself and not any indivduakl member of the class
    private static int noOfPersons = 0;

    // ArrayList
    private static ArrayList<Person> personList = new ArrayList();
    
    // constructor 1
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.money = 0;
        noOfPersons++;
        personList.add(this);
    }
    
    //constructor 2
    public Person(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
        noOfPersons++;
    }
    
    // method 1, no return value
    public void introduce() {
        System.out.println("Hi, my name is " + this.name + ".");
    }
    
    // overloaded method, decides which method to use based on which parameters are given
    public void introduce(Person other) {
        System.out.println("Hi " + other.getName() + ". My name is " + this.getName() + ".");
    }
    
    // method 2, no return value
    public void birthday() {
        this.age++;
    }
    
    // getter, returns double value
    public double getMoney() {
        return this.money;
    }
    
    // getter, returns string
    public String getName() {
        return this.name;
    }
    
    // method to set money
    public void setMoney(double newMoney) {
        this.money = newMoney;
    }
    
    public void setFriend(Person friend) {
        this.friend = friend;
    }
    
    public Person getFriend() {
        return this.friend;
    }
    
    // include 'static' keyword for static getter
    public static int getNoOfPersons() {
        return noOfPersons;
    }

    // get person from personList by using indexing
    public static Person getPerson(int index) {
        return personList.get(index);
    }

    // get person from personList by using Person.getName()
    public static Person getPerson(String name) {
        boolean found = false;
        // iterate through every item in ArrayList
        for (Person p : personList) {
            if (p.name.equals(name)) {
                found = true;
                return p;
            }
        }
        // if person is not found -- must be after iterating through every element in ArrayList
        if (!found) System.out.printf("No person named %s. %n", name);
        return null;
    }
}
