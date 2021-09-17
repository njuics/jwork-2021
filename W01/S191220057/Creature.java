//package W01.S191220057;

public class Creature extends Being
{

    int health;
    int attack;
    int defense;

    String name;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
    }

    public String getName()
    {
        return name;
    }
    public void speakTo(Creature creature, String something) {
        System.out.println(name +" tell " + creature.getName() + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        System.out.println(name + " attack " + creature.getName() + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(name + "got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(name + " am dead");
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }

}
