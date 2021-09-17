public class Soldier extends Creature {
    Soldier(String _name) {
        name = _name;
        health = 100;
        attack = 50;
        defence = 20;
    }

    public void yawn() {
        System.out.println(name + " yawned.");
    }

    public void arrest(Creature target) {
        System.out.println(name + " arrested " + target);
    }
}
