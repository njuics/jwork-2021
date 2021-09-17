package W01;

public class Huowa extends Creature {

    public Huowa() {
        name = "Huowa";
        health = 100;
        attack = 1;
        defense = 10;
    }

    public void fire(Item item) {
        System.out.println(name +" fire " + item);
        item.receiveFire();
    }
    
}
