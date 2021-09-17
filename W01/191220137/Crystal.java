//package W01.191220137;

public class Crystal extends Creature {
    Crystal(int hp, int ap, int dp) {
        health = hp;
        attack = ap;
        defense = dp;
    }

    public void beBroken() {
        System.out.println("I'm broken into peaces");
    }
}
