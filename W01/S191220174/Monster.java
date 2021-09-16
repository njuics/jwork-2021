public class Monster extends Creature {
    int magic;

    Monster(int hp, int ap, int dp, int mp,String n) {
        name = n;
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }


    public void surprise(){
        System.out.println(name + "is surprised and scared.");
        getmad();
    }
    public void fall(){
        System.out.println(name + " falls down.");
    }
    public void magical(){
        System.out.println(name + " changes his hand into a claw.");
    }
}