package exercise07;

public class WaterType extends Monster {
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

    @Override
    public void interact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interact'");
    }

    @Override
    public void inspect(Interactive i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inspect'");
    }
}
