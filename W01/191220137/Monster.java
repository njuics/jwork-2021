//package W01.191220137;

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

    public void wink(Creature c) {
        System.out.println("I wink at" + c + ".");
    }

    public void bePissed() {
        System.out.println("I'm so freakin pissed. ");
    }

    public void beAffraid() {
        System.out.println("I'm affraid.");
    }

    public void cry(){
        System.out.println("I'm crying.");
    }

}
