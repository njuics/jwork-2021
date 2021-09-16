public class Monster extends Creature {

    int magic;
    Monster() {}
    Monster(String np, int hp, int ap, int dp, int mp) {
        name = np;
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    public void attack(Creature c) {
        System.out.println("I(" + name + ") attack " + c + " of " + ap + "points");
        c.receiveAttack(this, ap * magic);
    }

    public void surprise(){
        System.out.println("I(" + name + ") am surprised.");
    }

    public void angry(){
        System.out.println("I(" + name + ") am angry.");
    }
}
