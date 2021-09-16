public class Monster extends Creature {
    int magic;

    Monster(int hp, int ap, int dp, int mp, String nm) {
        healthPoints = hp;
        attack = ap;
        defense = dp;
        magic = mp;
        name = nm;
    }

    @Override
    public void attack(Creature creature, int ap) {
        System.out.println("I attack " + creature.name + " of " + ap + " points");
        creature.receiveAttack(ap * magic);
    }

    public void rolleyes() {
        System.out.println("I roll my eyes. ");
    }
}
