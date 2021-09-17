package W01.S191220160;

public class Monster extends Creature{
    Monster(String name,int health,int attack,int defense){
        this.name=name;
        this.health=health;
        this.attack=attack;
        this.defense=defense;
        this.weapon=null;
    }
    public void rolleyes() {
        System.out.println(name+" roll his/her/its eyes. ");
    }
    
}
