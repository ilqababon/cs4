package exercise06;

public class Main {
    public static void main(String[] args) {
        //Create the main method in a separate java file. In the main method, create three Monsters, one of each type 
        //(you may choose the values for the Monsters). Simulate 3 separate battles, Grass vs Fire, Fire vs Water, and 
        //Water vs Grass. Create a loop so that they repeatedly attack each other until one or both HP is reduced to 0. 
        //There is no need for user input in the main method, so you may hardcode the entire process.

        Monster chikorita = new GrassType("Chikorita", 23, 45);
        Monster cyndaquil = new FireType("Cyndaquil", 39, 52);
        Monster totodile = new WaterType("Totodile", 50, 65);
        
        System.out.println("Round 1: Chikorita vs Cyndaquil");
        System.out.println("===============================");
        while (chikorita.getHP() != 0 && cyndaquil.getHP() != 0) {
            chikorita.attack(cyndaquil);
            cyndaquil.attack(chikorita);
        }

        if (chikorita.getHP() == 0 && cyndaquil.getHP() == 0) {
            System.out.println("This round is a draw.");
        }
        else if (chikorita.getHP() == 0) {
            System.out.println("Cyndaquil won round 1!");
        }
        else {
            System.out.println("Chikorita won round 1!");
        }

        System.out.println("Round 2: Chikorita vs Totodile");
        System.out.println("==============================");
        while (chikorita.getHP() != 0 && totodile.getHP() != 0) {
            chikorita.attack(totodile);
            totodile.attack(chikorita);
        }

        if (chikorita.getHP() == 0 && totodile.getHP() == 0) {
            System.out.println("This round is a draw.");
        }
        else if (chikorita.getHP() == 0) {
            System.out.println("Totodile won round 2!");
        }
        else {
            System.out.println("Chikorita won round 2!");
        }

        System.out.println("Round 2: Cyndaquil vs Totodile");
        System.out.println("==============================");
        while (cyndaquil.getHP() != 0 && totodile.getHP() != 0) {
            cyndaquil.attack(totodile);
            totodile.attack(cyndaquil);
        }

        if (cyndaquil.getHP() == 0 && totodile.getHP() == 0) {
            System.out.println("This round is a draw.");
        }
        else if (cyndaquil.getHP() == 0) {
            System.out.println("Totodile won round 2!");
        }
        else {
            System.out.println("Chikorita won round 2!");
        }
    }
}
