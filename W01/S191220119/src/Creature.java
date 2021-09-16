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
        System.out.println(String.format("%s said to %s: %s", name, creature.name, something));
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(String.format("%s heard %s", name, something));
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap){
        System.out.println(String.format("%s attack %s of %d points", name, creature.name, ap));
        creature.receiveAttack(ap);
    }

    public void attack(Creature creature, int ap, Prob wp) {
        int totalAp = ap + wp.addition;
        System.out.println(String.format("%s attack %s with %s of %d points", name, creature.name, wp.name, totalAp));
        creature.receiveAttack(totalAp);
    }

    public void receiveAttack(int ap) {
        if(!isDead()){
            if(defense < ap){
                health -= ap;
                System.out.println(String.format("%s am attacked of %d points", name, ap));
            }
        }
    }

    public boolean isDead() {
        if(health <= 0){
            System.out.println(String.format("%s is dead", name));
            return true;
        }
        return false;
    }
}
