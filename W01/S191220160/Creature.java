package W01.S191220160;
public class Creature extends Being{ 
    
    int health;
    int attack;
    int defense;
    Weapon weapon;

    public void getWeapon(Weapon weapon){
        this.weapon=weapon;
        System.out.println(name + " get Weapon " + weapon.getName());
    }

    public void laughOutLoud(){
        System.out.println(name + ": 哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
    }

    public void attack(Creature creature) {
        System.out.println(name + " attack " + creature.getName() + " of " + attack + "points");
        creature.getAttack(attack);
    }
    public void attackWithWeapon(Creature creature ){
        if(this.weapon==null)return;
        System.out.println(name + " attack " + creature.getName() + " with "+ weapon.getName());
        weapon.attackCreature(creature);
    }

    public void getAttack(int attack){   //only reduce health when attack>defense!
        if(attack>this.defense){
            receiveDamage(attack);
        }
        else{
        System.out.println(name + " defended well and didn't get hurt!" );
        }
    }

    public  void receiveDamage(int attack){
        if (!isDead()) {
            health -= attack;
            System.out.println(name + " got " + attack + " points damage!");
            isDead();
        }
    }

    public boolean isDead() {
        if (health <= 0) {
            System.out.println(name + " is dead");
            return true;
        }
        return false;
    }
}
