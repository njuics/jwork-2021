

public class Monster extends Creature {

    int magic;

    Monster(String _name , int hp, int ap, int dp, int mp) {
        super(_name);
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c, int ap , String type) {
        System.out.println("I attack " + c + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }


}
