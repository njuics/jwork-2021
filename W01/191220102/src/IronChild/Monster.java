package IronChild;

public class Monster extends Yaojing {
    boolean hasHardSword;
    boolean hasSoftSword;
    int hasSwing;

    public Monster(String n, int hp, int ap, int dp, int mp) {
        super(n, hp, ap, dp, mp);
        hasHardSword = false;
        hasSoftSword = false;
        hasSwing = 0;
    }

    @Override
    public void attack(Creature creature, int damage) {
        System.out.println(name + ":I attack " + creature.name + " of " + damage * magic + "points");
        creature.receiveAttack(name, damage * magic);
        if (hasSwing != 0) {
            attack /= (hasSwing + 1);
            hasSwing = 0;
        }
    }

    public void swingSword(int times) {
        System.out.println(name + ":I swing my sword " + times + " times,so my attack improves.");
        attack *= (times + 1);
        hasSwing = times;
    }

    public void hardSword() {
        if (!hasHardSword) {
            System.out.println(name + ":I use the hard sword,so my magic improves.");
            magic *= 10;
            hasSoftSword = false;
            hasHardSword = true;
        }
    }

    public void softSword() {
        if (hasHardSword) {
            magic /= 10;
            System.out.println(name + ":I use the soft sword.");
            hasHardSword = false;
            hasSoftSword = true;
        }
    }
}
