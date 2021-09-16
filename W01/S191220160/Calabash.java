package W01.S191220160;

public class Calabash extends Creature{
    Calabash(String name,int health,int attack,int defense){
        this.name=name;
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.weapon=null;
    }
    public void spit() {
        System.out.println(name+" spit and says:\"呸！真不要脸!\" ");
    }
    public void breakWeapon(Weapon weapon){
        weapon.beBroken();
    }
}
