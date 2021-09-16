package liuwanb;

public class Scorpion extends Monster {
    public Scorpion(){
        health = 700;
        attackDamage = 50;
        hitChance = 0.9;
        dodgeChance = 0.0;
        needToRefresh = true;
        updateBuff();
        setName("蝎子精");
    }
    public void beAngry(){
        System.out.print(getName()+"感到十分愤怒。\n");
    }
}
