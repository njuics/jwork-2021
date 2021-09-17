public class Creature extends Being {
    String name;
    int health;
    int attack;
    int defense;
    int san;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
        san = 100;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }
    public void listen(String something) {
        System.out.println(name +" heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }    
    public void attack(Creature creature, int ap) {
        System.out.println(name +" attack " + creature.name + " of " + ap + " points");
        creature.receiveAttack(ap);
    }
    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                health -= ap;
                System.out.println(name +" got " + ap + " points attack");
            }
            else System.out.println(name + " is not injured");
        }
    }
    public boolean isDead() {

        if (health <= 0) {
            System.out.println(name +" is dead");
            return true;
        }

        return false;
    }
    public void wave(Creature creature){
        System.out.println(name + " try to attack "+creature.name+" but fail");
        creature.dodge();
    }
    public void dodge(){
        System.out.println(name+ " dodges the attack");
    }
    public void laugh(){
        System.out.println(name + " laugh:hahahahahahahahahahahahahahahahahaha");
    } 
    public void sneer(Creature creature,String something){
        System.out.println("'" + something + "'"+ name+" laughed.");
        creature.getmad();
    }
    public void getmad(){
        if(!isbreakdown()){
            san -= 20;
            System.out.println(name+" 's san dropped by 20 points");
        }
        isbreakdown();
    }
    public boolean isbreakdown(){
        if(san <=0){
            System.out.println(name +" is breakdown.");
            escape();
            return true;
        }
        return false;
    }
    public void escape(){
        System.out.println(name + " says:'你给陆大有！'");
        System.out.println(name + " ran away!");
    }
}