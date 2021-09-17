//package W01.191220107;

public class Human extends Creature {
    Human(String _name) {
        name = _name;
        health = 100;
        attack = 20;
        defence = 1;
    }

    public void stumble() {
        System.out.println(name + " stumbled.");
    }

    public void cry() {
        System.out.println(name + " cryed.");
    }
}
