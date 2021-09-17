package W01;

public class Creature extends Being {
    

    int health;
    int attack;
    int defense;
    String name;


    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tell " + creature + ":" + something);
        creature.listen(something);
    }


    public void listen(String something) {
        System.out.println(name + " heard: " + something);
    }
    

    public void attack(Creature creature, int atkValue) {
        System.out.println(name + " attack " + creature + ":" + atkValue + "point(s)");
        creature.receiveAttack(atkValue);
    }


    public void receiveAttack(int atkValue) {
        if (isDead())
            return;
        if (defense <= atkValue) {
            health = health + (defense - atkValue);
            System.out.println(name + " got " + (defense-atkValue) + " point(s) damage");
        }
    }


    public boolean isDead() {
        if (health <= 0)
            return true; 
        return false;
    }


}
