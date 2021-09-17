
//package W01.S191220057;

public class Flayrat extends Creature {

    int magic;

    Flayrat() {
        name = "Flayrat";
        health = 100;
        attack = 10;
        defense = 10;

    }

    public void mythrow(Creature c) {
        System.out.println(name + " throw " + c.getName() + "out");
        c.receiveAttack(attack);
    }

    public void spear(Creature c){
        System.out.println(name + " spear " + c.getName());
        c.receiveAttack(attack);
    }
    @Override
    public void attack(Creature c, int ap) {
        System.out.println(name + " attack " + c.getName() + " of " + ap + "points");
        c.receiveAttack(attack);
    }

  

}
