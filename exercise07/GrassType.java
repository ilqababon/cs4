package exercise07;

public class GrassType extends Monster {
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
