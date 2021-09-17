public class Snake extends Creature {
    public Snake(String name, int hp, int speed, int defense) {
        super(name, hp, speed, defense);
    }

    public void useWeapon() {
        System.out.println(this.name + " use weapon.");
    }
}
