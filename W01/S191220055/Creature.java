package W01.S191220055;

public class Creature extends Being {

    int health;
    int attack;
    int defense;
    boolean is_dead;

    public Creature() {
        is_dead = false;
    }

    public void speak(String something) {
        System.out.println(name+" say: " + "'" + something + "'");
    }

    public void attack(Creature creature, int ap, boolean is_successful) {//攻击不一定成功
        if(is_successful){
            System.out.println(name+" attack " + creature.getName() + " of " + ap + " points");
            creature.receiveAttack(ap);
        }      
        else{
            System.out.println(name+" attack " + creature.getName()+" but fail");
        }  
    }

    public void receiveAttack(int ap) {
        if (!is_dead) {
            if (defense < ap) {
                health -= ap;
                if(health <= 0){
                    is_dead = true;
                    System.out.println(name+" got " + ap + " points attack and died");
                }
                else{
                    System.out.println(name+" got " + ap + " points attack");
                } 
                
            }
            else{ // 攻击无效
                System.out.println(ap + " points attack doesn`t work");
            }
        }
    }

    public boolean isDead() {
        return is_dead;
    }
}
