package liuwanb;

public class Monster extends Creature{
    public Monster(){
        health = 100;
        attackDamage = 10;
        hitChance = 1.0;
        dodgeChance = 0.0;
        needToRefresh = true;
        updateBuff();
        setName("小喽啰");
    }
    public boolean search(Creature target){
        System.out.print(getName()+"开始搜索"+target.getName()+"...搜寻失败！\n");
        return false;
    }
}
