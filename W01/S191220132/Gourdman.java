package W01.S191220132;

public class Gourdman extends Creature{
    int magic;

    Gourdman(int hp, int ap, int dp, int mp) {
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

    public void beTied(){
        System.out.println("I am tied up");
    }

    public void beDropped(){
        System.out.println("I am dropped down");
    }

}
