package W01.S191220132;

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

    public void doMagic(String something) {
        System.out.println("I do the magic "+ something);
    }

    public void bleed(int ap){
        System.out.println("I am bleed!" +"of " + ap + "points");
        receiveAttack(ap * magic);
    }
}
