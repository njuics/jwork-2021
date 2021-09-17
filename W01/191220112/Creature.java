public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature(String name) {
        super(name);
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        this.tellName();
        System.out.println("I tell " + creature.getName() + " '" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        this.tellName();
        System.out.println("I heard: '" + something + "'");
        memory[memoryOffset] = something;
        memoryOffset = (memoryOffset + 1) % memory.length;
    }

    public void beUntied() {
        this.tellName();
        System.out.println("I'm untied. ");
    }

    public void beAfraid() {
        this.tellName();
        System.out.println("Ah...");
    }

    public void beSurprised() {
        this.tellName();
        System.out.println("What's up? ");
    }

    public void attack(Creature creature, int ap) {
        this.tellName();
        System.out.println("I attack " + creature.getName() + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                this.tellName();
                System.out.println("I got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            this.tellName();
            System.out.println("I am dead");
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }

}
