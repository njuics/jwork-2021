

public class Gourd extends Creature{
    int specialAbility;    //未使用
    
    public Gourd(double hp, int memorySize, double defence, double aggressivity, String name){
        super(hp, memorySize, defence, aggressivity, name);
    }

    public void beAttacked(double strength, Creature attacker){
        System.out.println(this.toString() + "反弹了伤害。");
        attacker.beAttacked(strength, this);
    }

    
}
