

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

    public void listen(String something) {
        System.out.println("I heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println("I tell " + creature + "'" + something + "'");
        creature.listen(something);
    }

    public void attack(Creature creature, int ap) {
        System.out.println("I attack " + creature + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense <= ap) {
                health -= (ap-defense);
                System.out.println("I got " + ap + "points attack and it broke my defence" );
            }
            else if (defense > ap){
                defense -= ap;
                System.out.println("I got " + ap + "points attack, but it failed to break my defence");
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
   
    public void throwFork(Fork fork, Creature creature){
        System.out.println("I throw " + fork + "to" + creature);              
        fork.beThrown(creature);
    }
   
    public void laugh(){
        System.out.println("I laugh. ");
    }

}
