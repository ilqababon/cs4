package exercise06;

public class WaterType extends Monster {
    //WaterType: a Monster that has a type "water", strong against "fire", weak against "grass", 
    //and whose atk is 0.7 times the base value and def is 1.3 times the base value. The special of WaterTypes 
    //increase their def by 2 points at the cost of reducing their HP by 10% of their maxHP.

    public WaterType(String name, int hp, int base) {
        super(name, "water", "fire", "grass", hp, base);
        this.atk = (int)(0.7 * base);
        this.def = (int)(1.3 * base);
    }

    @Override
    public void special() {
        this.def += 2;
        this.hp = (int)(0.9 * this.getMaxHP());
    }
}
