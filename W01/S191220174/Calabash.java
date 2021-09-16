public class Calabash extends Creature{
    Calabash(int hp,int ap,int dp,String n){
        name = n;
        health = hp;
        attack = ap;
        defense = dp;
    }

    public void putPants(){
        System.out.println(name + " puts on his pants.");
    }

    public void destory(Weapon weapon,int ap){
        System.out.println(name + " break "+ weapon.name + " of " + ap);
        weapon.receivehurt(ap);
    }
}