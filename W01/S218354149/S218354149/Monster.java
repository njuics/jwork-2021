package S218354149;

public class Monster extends Creature {
    boolean Swordthrown = false;

    Monster(String n, int hp, int ap, int dp) {
        name = n;
        health = hp;
        attack = ap;
        defense = dp;
    }

    @Override
    public void attack(Creature creature, int ap) {
        if (throwSword(creature) == true) {
            ap += 10;
        }
        System.out.println(name + " attack " + creature.name + " of " + ap + " points");
    }

    public void pullString(Creature creature) {
        // 蜘蛛拉網造成傷害
        attack += 5;
        attack(creature, attack);
    }

    public boolean throwSword(Creature creature) {
        Swordthrown = true;
        return Swordthrown;
    }

}
