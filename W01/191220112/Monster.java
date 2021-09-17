public class Monster extends Creature {

    int magic;

    Monster(String name, int hp, int ap, int dp, int mp) {
        super(name);
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c, int ap) {
        this.tellName();
        System.out.println("I attack " + c.getName() + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }

    public void rolleyes() {
        this.tellName();
        System.out.println("I roll my eyes. ");
    }

    public void wink() {
        this.tellName();
        System.out.println("I wink. ");
    }

    public void bePissed() {
        this.tellName();
        System.out.println("I'm so freakin pissed. ");
    }

}
