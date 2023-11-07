package exercise06;

public class Main {
    public static void main(String[] args) {

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

        System.out.print("\n");

        chikorita.resetHealth();
        cyndaquil.resetHealth();

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

        System.out.print("\n");

        chikorita.resetHealth();
        totodile.resetHealth();

        System.out.println("Round 3: Cyndaquil vs Totodile");
        System.out.println("==============================");
        while (cyndaquil.getHP() != 0 && totodile.getHP() != 0) {
            cyndaquil.attack(totodile);
            totodile.attack(cyndaquil);
        }

        if (cyndaquil.getHP() == 0 && totodile.getHP() == 0) {
            System.out.println("This round is a draw.");
        }
        else if (cyndaquil.getHP() == 0) {
            System.out.println("Totodile won round 3!");
        }
        else {
            System.out.println("Cyndaquil won round 3!");
        }

        System.out.print("\n");

        cyndaquil.resetHealth();
        totodile.resetHealth();
    }
}
