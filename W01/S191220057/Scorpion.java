

//package W01.S191220057;

public class Scorpion extends Creature {

    int magic;

    Scorpion() {
        name = "Scorpion";
        health = 200;
        attack = 20;
        defense = 10;
        magic = 2;

    }

    public void mythrow(Creature c) {
        System.out.println(name + " throw " + c.getName() + "out");
        c.receiveAttack(attack);
    }

    public void choke(Creature c){
        System.out.println(name + " choke" + c.getName() + "to death");
        c.receiveAttack(attack);
    }

    public void bePissed() {
        System.out.println("I'm so freakin pissed. ");
    }
    
    @Override
    public void attack(Creature c, int ap) {
        System.out.println(name + " attack " + c.getName() + " of " + ap + "points");
        c.receiveAttack(attack);
    }

  

}
