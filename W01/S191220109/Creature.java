public class Creature extends Being {

    int health;
    int attack;
    int defense;
    int enemy;
    int down;

    String name;
    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println("I(" + name + ") tell " + creature.name + ": '" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println("I(" + name + ") heard: '" + something + "'");
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Monster moster) {
        System.out.println(name + ": Attacking " + moster.name + " of " + attack + " points!");
        moster.receiveAttack(this, attack);
    }

    public void receiveAttack(Creature creature, int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health += (defense - ap);
                System.out.println(name + ": I'm hit! I'm hit! I got " + (ap - defense) + " points attack from " + creature.name + "!");
                if (isDead()){
                    System.out.println(name + ": I have been destroyed!");
                    creature.watch();
                }
                else
                    System.out.println("(" + name + ") AP remains: " + ap);
            } else
                System.out.println(name + ": Successfully defended against an attack from " + creature.name + "!");
        }
    }

    public void detect() {
        ++enemy;
    }

    public void watch() {
        ++down;
    }

    public boolean isDead() {
        if (health <= 0)
            return true;
        return false;
    }
}
