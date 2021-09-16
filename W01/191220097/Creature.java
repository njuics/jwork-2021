public class Creature extends Being {
    int healthPoints;
    int attack;
    int defense;
    String name;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[10];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println("I tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println("I heard: " + "'" + something + "'");
        memory[memoryOffset] = something;
        memoryOffset = (1 + memoryOffset) % memory.length;
    }

    public void attack(Creature creature, int power) {
        System.out.println("I attack " + creature.name + " of " + power + "points");
        creature.receiveAttack(power);
    }

    public void receiveAttack(int power) {
        if (defense - power >= 0) {
            defense -= power;
            System.out.println("I'm able to defend this " + power + " points attack");
        } else {
            healthPoints -= power;
            if (isDead()) {
                System.out.println(" but the enemy doesn't let me go");
            } else {
                System.out.println("I got " + power + "points attack");
            }

        }
    }

    public void mood(String curMood) {
        System.out.println(name + curMood);
    }

    public void breakItems(String item) {
        System.out.println("I break" + item);
    }

    public boolean isDead() {
        if (healthPoints <= 0) {
            System.out.println("I am dead");
            return true;
        }
        return false;
    }

    public void move() {

    }

    public void action(String act) {
        System.out.println(name + act);
    }

}
