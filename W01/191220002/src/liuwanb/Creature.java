package liuwanb;

public class Creature extends Being{
    static public int buffCup=5;
    public Buff[] buff;
    int health;
    int attackDamage;
    int applyAttackDamage;
    boolean needToRefresh;
    double dodgeChance;
    double applyDodgeChance;
    double hitChance;
    double applyHitChance;
    public Creature(){
        buff = new Buff[buffCup];
        for (int i = 0; i < buffCup; i++) {
            buff[i] = new Buff(0);
        }
    }
    public void speakTo(Creature target,String s){
        System.out.print(getName()+"对"+target.getName()+"说：\'"+s+"\'\n");
    }
    public void speakTo(String s){
        System.out.print(getName()+"自言自语道：\'"+s+"\'\n");
    }
    public void useItem(Entity item){
        item.beUsed(this);
    }
    public void useItem(Entity item,Creature target){
        item.beUsed(this,target);
    }
    public void attack(Creature target){
        System.out.print(getName()+"使出了普通攻击"+"，");
        target.hurt(this,attackDamage);
    }
    public void hurt(Creature attacker, int damage){
        if(attacker.applyHitChance-applyDodgeChance<Math.random()){
            System.out.print("但"+getName()+"躲开了。\n");
            return;
        }
        System.out.print("对"+getName()+"造成了"+damage+"点伤害。\n");
        health -= damage;
    }
    public void move(){
        System.out.print(getName()+"移动了。\n");
    }
    public boolean addBuff(Buff abuff){
        Buff bbuff = searchBuff(abuff);
        abuff.showAffect(this);
        if(bbuff!=null){
            bbuff.duration = Math.max(bbuff.duration, abuff.duration);
            return true;
        }
        for (int i = 0; i < buffCup; i++) {
            if (buff[i].isNull){
                buff[i] = abuff;
                updateBuff();
                return true;
            }
        }
        System.out.print("添加状态失败！\n");
        return false;
    }
    public void updateBuff(){
        if(needToRefresh){
            applyDodgeChance = dodgeChance;
            applyHitChance = hitChance;
            applyAttackDamage = attackDamage;
        }
        for (int i = 0; i < buffCup; i++) {
            if(buff[i].isNull)continue;
            buff[i].duration-=1.0;
            if(buff[i].duration<=0){
                buff[i].disappear(this);
                buff[i]=new Buff(0);
                continue;
            }
            if(needToRefresh)buff[i].affect(this);
        }
    }
    public Buff searchBuff(Buff abuff){
        for (int i = 0; i < buffCup; i++) {
            if(buff[i].getClass()==abuff.getClass())    return buff[i];
        }
        return null;
    }
    public Buff searchBuffByName(String s){
        for (int i = 0; i < buffCup; i++) {
            if(buff[i].getName()==s)    return buff[i];
        }
        return null;
    }
    public boolean clearBuffByName(String s){
        boolean result = false;
        for (int i = 0; i < buffCup; i++) {
            if(buff[i].getName()==s){
                result = true;
                buff[i].disappear(this);
                buff[i] = new Buff(0.0);
            }
        }
        return result;
    }
}
