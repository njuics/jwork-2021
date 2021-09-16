public class Monster extends Creature{
    int magic;

    Monster(String sname, int hp, int ap, int dp, int mp){
        name = sname;
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature creature, int ap){
        int totalAp = ap * magic;
        System.out.println(String.format("%s attack %s of %d points", name, creature.name, totalAp));
        creature.receiveAttack(totalAp);
    }

    @Override
    public void attack(Creature creature, int ap, Prob wp){
        int totalAp = ap * magic + wp.addition;
        System.out.println(String.format("%s attack %s with %s of %d points", name, creature.name, wp.name, totalAp));
        creature.receiveAttack(totalAp);
    }
}
