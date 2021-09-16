public class Monster extends Creature {

    public Monster(int hp, int ap, int dp, int mp, String myname) {
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
        name=myname;
    }

    public void surprise() {
        System.out.println(this.name + " said: ???Ah?");
    }

}