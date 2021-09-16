package W01.S191220160;

public class Weapon extends Being{ //things like IceCube,Ruyi(法杖),Spear,Mirror,etc...
    int attack;
    String last_words; //遗言
    Weapon(String name,int attack,String last_words){
        this.name=name;
        this.attack=attack;
        this.last_words=last_words;
    }
    public void attackCreature(Creature creature){
        creature.getAttack(attack);
    }
    public void beBroken(){
        attack=0;
        speak(last_words);
    }
}
