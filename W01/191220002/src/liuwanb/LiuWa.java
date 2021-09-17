package liuwanb;

public class LiuWa extends Creature{
    public LiuWa(){
        health = 350;
        attackDamage = 70;
        hitChance = 1.0;
        dodgeChance = 0.0;
        needToRefresh = true;
        updateBuff();
        setName("六娃");
    }
     public void fadeOut(){
        if(searchBuffByName("禁锢")!=null){
            System.out.print(getName()+"被禁锢了，隐形不了！\n");
            return;
        }
        System.out.print(getName()+"使用了神通");
        Buff b = new BeInvisible(20);
        addBuff(b);
     }
     public void laugh(){
        System.out.print(getName()+"大笑道：哈哈哈哈！\n");
     }
     public void kick(Creature target){
        System.out.print(getName()+"使出了飞踢"+"，");
        target.hurt(this,attackDamage);
     }
     public void visuallyInduce(Creature target){
         System.out.print(getName()+"将自己的影子映在墙上"+"，");
         Buff nbuff = new BeInduced(20);
         target.addBuff(nbuff);
     }
     public void escape(){
        System.out.print(getName()+"施展神通从困境中逃出了！\n");
        clearBuffByName("禁锢");
     }
     public void taunt(Creature target){
        System.out.print(getName()+"说：哈哈我在这呢！\n");
        System.out.print(getName()+"发出了嘲讽，显然激怒了"+target.getName()+'\n');
        target.attack(this);
     }
}
