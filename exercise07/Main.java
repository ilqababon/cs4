package exercise07;

public class Main {
    public static void main(String[] args) {

        Trainer xangel = new Trainer("Xangel");
        Monster chikorita = new GrassType("Chikorita", 23, 45);
        NPC manu = new NPC("Manu");
        Location hoenn = new Location("Hoenn", "Berry");

        chikorita.interact();
        manu.interact();
        hoenn.interact();
    }
}