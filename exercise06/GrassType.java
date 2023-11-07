package exercise06;

public class GrassType extends Monster {
    //GrassType: a Monster that has a type "grass", strong against "water", weak against "fire", 
    //and whose atk and def is equal to the base value. The rest() of GrassTypes heal by half the maxHP. 
    //The special of GrassTypes raise their health by 20% of the maxHP.
    public GrassType(String name, int hp, int base) {
        super(name, "grass", "water", "fire", hp, base);
    }

    @Override
    public void rest() {
        hp += this.getMaxHP() * 0.5;
        if(hp > this.getMaxHP()) hp = this.getMaxHP();
        System.out.println(this.getName() + " rested. It's health is now " + hp + ".");
    }

    public void special() {
        hp += this.getMaxHP() * 0.2;
        System.out.println(this.getName() + " did a pose.");
    }
}
