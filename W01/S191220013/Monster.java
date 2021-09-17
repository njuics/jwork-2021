

public class Monster extends Creature {

    Monster(int hp, int ap, int dp, int mp) {
        health = hp;
        attack = ap;
        defense = dp;
    }

    @Override
    public void attack(Creature c, int ap) {
        System.out.println("I attack " + c + " of " + ap + "points");
        c.receiveAttack(ap);
        
    }

    public void rolleyes() {
        System.out.println("I roll my eyes. ");
    }

}


