package liuwanb;

public class Snake extends Monster{
    public Snake(){
        health = 300;
        attackDamage = 70;
        hitChance = 1.0;
        dodgeChance = 0.0;
        needToRefresh = true;
        updateBuff();
        setName("蛇精");
    }
    @Override
    public boolean search(Creature target){
        System.out.print(getName()+"开始搜索"+target.getName()+"...搜寻成功！\n");
        return true;
    }
}
