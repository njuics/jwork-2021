package W01.S191220055;

public class Monster extends Creature {

    Monster(String _name,int hp, int ap, int dp) {
        name = _name;
        health = hp;
        attack = ap;
        defense = dp;
    }
    
    public void rolleyes() {
        System.out.println(name+" is rolling eyes.");
    }

    public void lookForTarget() {//寻找目标
        System.out.println(name + " is looking for target.");
    }

    public void drawWeb() { //收网
        System.out.println(name + " is drawing web.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public void wakeup(){
        System.out.println(name + " wake up.");
    }
}
