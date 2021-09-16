public class Creature{

private int health;
private int attack;
private String name;

public String toString(){
    return name;
}

public Creature(int health,int attack,String name){
    this.attack = attack;
    this.health = health;
    this.name = name;
}

public void talk(String word,Creature listener){
    System.out.println(this+" speaks to "+listener+" : "+word);
    listener.heard(word);
}

public void heard(String word){
    System.out.println(this+" hears "+word);
}

public void beAttacked(int amount){
    System.out.println(this+" is attacked.");
    if(health >= amount)health -= amount;
    else{
        health = 0;
    }
    if(health == 0)System.out.println(this+" died.");
}

public void attackOtherCreature(Creature attacked){
    System.out.println(this+" attack(s) "+attacked);
    attacked.beAttacked(attack);
}

}