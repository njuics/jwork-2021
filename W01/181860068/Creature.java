public class Creature extends Being{
    protected int damage;
    protected int defence;
    protected Utility equipment;

    public Creature(String name, int damage, int defence){
        super(name);
        this.damage = damage;
        this.defence = defence;
    }
    
    public void equip(Utility equipment){
        this.equipment = equipment;
        System.out.println(name + " equips " + equipment.name + " ( " + equipment.state + " ) ");
    }

    public void action(String act){
        System.out.println(name + " " + act);
    }

    protected void defence(int damage){
        if(damage > defence){
            System.out.println(name + " is killed ");
        }
        else{
            System.out.println(name + " defends the attack ");
        }
    }

    public void attack(Creature target){
        target.defence(damage);
        System.out.println(name + " attacks " + target.name);
    }
}
