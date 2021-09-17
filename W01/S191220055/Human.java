package W01.S191220055;

public class Human extends Creature {

    Human(String _name,int hp, int ap, int dp) {
        name = _name;
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

    public void useWindAccompanyingEar(String something){//顺风耳
        System.out.println(name + " is using Wind-accompanying Ear and heard: "+something);
    }
}
