package W01.S181860072.src;

public class Creature extends Being{
    protected int health;
    protected int attack;
    protected int defense;

    protected String[] memory;
    protected int memoryOffset;

    Being hand;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
        hand = null;
    }

    public void speakTo(Creature creature, String something) {
        if(creature!=this){
            System.out.println(this+": I tell " + creature + "'" + something + "'");
            creature.listen(this,something);
        }
        else{
            System.out.println(this+": '"+something+"'");
        }
    }

    public void listen(Creature creature,String something) {
        System.out.println(this+": I heard from "+creature+": " + something);
        memory[memoryOffset % memory.length] = something;
        memoryOffset = memoryOffset+1;
    }

    public void attack(Creature creature) {
        System.out.println(this+": I attack " + creature + " of " + attack + "points");
        creature.receiveAttack(attack);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(this+": I got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(this+": I am dead");
            return true;
        }

        return false;
    }

    public void moveAct(String description) {
        System.out.println(this+": "+description);
    }

    public void facialExpression(String description){
        System.out.println(this+" "+description);
    }

    public void passThing(Creature creature){
        System.out.println(this+" pass "+hand+" to "+creature);
        creature.receiveThing(hand);
        hand = null;
    }
    
    public void pickThing(Being being){
        System.out.println(this+" pick "+being);
        hand = being;
    }

    public void receiveThing(Being being){
        System.out.println(this+" receive "+being);
        hand=being;
    }
}
