package proj;

public class Creature extends Being{
    String name;
    int health;
    int attack;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        int memoryOffset=0;
    }

    public boolean isDead() {
        if (health <= 0) {
            System.out.println("I am dead");
            return true;
        }
        return false;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name+" tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name+" heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int hurt) {
        System.out.println(name+" attack " + creature.name + " of " + hurt + "points");
        creature.receiveAttack(hurt);
    }

    public void receiveAttack(int hurt) {
        health-=hurt;
        if(!isDead())
            System.out.println(name+" got " + hurt + " points attack");
    }

    public void move() {
        System.out.println(name+" is walking");
    }
}
