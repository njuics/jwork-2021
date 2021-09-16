package W01.S191220055;

public class Pangolin extends Creature {

    Pangolin(int hp, int ap, int dp) {
        name = "pangolin";
        health = hp;
        attack = ap;   
        defense = dp;
    }

    public void hide(){
        System.out.println(name + " is hiding.");
    }

    public void run(){
        System.out.println(name + " is running.");
    }

    public void bait(){
        System.out.println(name + " is baiting.");
    }
}
