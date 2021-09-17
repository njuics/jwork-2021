public class Monster extends Creature{
    
    public Weapon weapon;

    public Monster(int health,int attack,String name,Weapon weapon){
        super(health,attack,name);
        this.weapon = weapon;
    }


}