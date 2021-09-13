package W01.example;

public class Monster extends Creature {

    int magic;

    Monster(int hp, int ap, int dp, int mp) {
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c, int ap) {
        System.out.println("I attack " + c + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }

    public void rolleyes() {
        System.out.println("I roll my eyes. ");
    }

    public void bePissed() {
        System.out.println("I'm so freakin pissed. ");
    }

}
