package exercise06;

public class GrassType extends Monster {
    private int atk, def;

    //GrassType: a Monster that has a type "grass", strong against "water", weak against "fire", 
    //and whose atk and def is equal to the base value. The rest() of GrassTypes heal by half the maxHP. 
    //The special of GrassTypes raise their health by 20% of the maxHP.
    public GrassType(String name, int hp, int base) {
        super(name, "grass", "water", "fire", hp, base);
        this.atk = base;
        this.def = base;
    }

    
}
