

public class Monster extends Creature{
    Broadsword sword = new Broadsword(10); //先拿上大宝剑，具体干啥再想想

    public Monster(double hp, int memorySize, double defence, double aggressivity, String name){
        super(hp, memorySize, defence, aggressivity, name);
    }

    public void evolve(){
        System.out.println(this.toString() + "改变了自身的形态。");
    }

    public void block(double strength){   //刀掉血
        sword.broke(strength);
    }

    
}
