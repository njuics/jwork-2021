public class Creature extends Being{
    int health;
    int attack;
    int defense;

    String name;

    String[] memory;
    int memoryoffset;

    Creature(){
        memory = new String[7];
        memoryoffset = 0;
    }

    public void speakTo(Creature creature, String something){
        System.out.println(this.name + " tells " + creature.name + ": " + "'" + something +"'");
        creature.lisen(something);
    }

    public void lisen(String something){
        System.out.println(this.name + " hears: " + "'" + something + "'");
        memory[memoryoffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        System.out.println(this.name + " attacks " + creature.name + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(this.name + " gets " + ap + " points attack.");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(this.name + " is dead");
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }




}