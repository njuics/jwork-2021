public class CalabashBrother extends Creature {
    public CalabashBrother(String name, int hp, int speed, int defense) {
        super(name, hp, speed, defense);
        defenseStronger();
    }

    private void defenseStronger() {
        this.defense = Integer.MAX_VALUE;
    }
}
