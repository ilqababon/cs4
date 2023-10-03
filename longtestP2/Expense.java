/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package longtestP2;

/**
 *
 * @author staff
 */
public class Expense {
    private String name;
    private double cost;
    
    public Expense(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
    public String getName(){
        return this.name;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}
