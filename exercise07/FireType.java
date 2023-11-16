package exercise07;

public class FireType extends Monster {
    public FireType(String name, int hp, int base) {
        super(name, "fire", "grass", "water", hp, base);
        this.atk = (int)(1.3 * base);
        this.def = (int)(0.7 * base);
    }

    @Override
    public void special() {
        this.atk += 2;
        this.hp = (int)(0.9 * this.getMaxHP());
        System.out.println(this.getName() + " did a pose.");
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