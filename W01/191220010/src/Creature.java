public class Creature extends being{

    int health;
    int attack;
    int defense;
    String name;
    public Creature(){
       
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name+" tell " + creature + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name+" heard: " + something);
    }

    public void attack(Creature creature, int ap) {
        System.out.println(name+" attack " + creature + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(name+" got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(name+" is dead");
            return true;
        }

        return false;
    }

}
    
