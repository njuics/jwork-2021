//package W01.191220137;

public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println("I tell " + creature + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println("I heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        System.out.println("I attack " + creature + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (defense < ap) {
            health -= ap;
            System.out.println("I got " + ap + "points attack");
            if (isDead()) {
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println("I am dead");
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }

}
