package IronChild;

public class Yaojing extends Creature {
    int magic;

    public Yaojing(String n, int hp, int ap, int dp, int mp) {
        name = n;
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature creature, int damage) {
        System.out.println(name + ":I attack " + creature.name + " of " + damage * magic + "points");
        creature.receiveAttack(name, damage * magic);
    }
}
