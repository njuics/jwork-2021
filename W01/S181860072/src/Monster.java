package W01.S181860072.src;

public class Monster extends Creature{
    int magic;

    Monster(int hp, int ap, int dp, int mp) {
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
        
    }

    @Override
    public void attack(Creature c) {
        System.out.println("I attack " + c + " of " + attack + "points");
        c.receiveAttack(attack * magic);
    }
}
