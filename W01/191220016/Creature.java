public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature(String _name) {
        name=_name;
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tells " + creature.get_name() + " '" + something + "'.");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + "'" + something + "'.");
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap , String type) {
        System.out.println("I attack " + creature + " of " + ap + " points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(name + " got " + ap + " points attack.");
            }
            else{
                health -= 1;
                System.out.println(name + " got 1 points attack.");
            }
        }
        if(isDead()){
            System.out.println(name + " is dead.");
        }

    }

    public void receiveRock(Rock rock , Creature attacker) {
        health-=rock.get_weight();
    }

    public boolean isDead() {

        if (health <= 0) {
            
            return true;
        }

        return false;
    }

    public void move() {

        // not implemented yet

    }

}
