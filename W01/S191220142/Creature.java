public class Creature extends Being{
    String name;
    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
    }

    public Creature(String nm){
        name = nm;
        memory = new String[7];
        memoryOffset = 0;
    }

    public Creature(String nm, int hp, int ap, int dp){
        name = nm;
        health = hp;
        attack = ap;
        defense = dp;
        memory = new String[7];
        memoryOffset = 0;
    }

    public String getName(){
        return name;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tells " + creature.getName() + " :\"" + something + "\"");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
        memoryOffset += 1;
    }

    public void attack(Creature creature) {
        System.out.println(name + " attacks " + creature.getName() + " of " + attack + " points");
        creature.receiveAttack(attack);
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
            if (defense < ap) {
                int damage = ap - defense;
                health -= damage;
                System.out.println(name + " got " + damage + " points attack");
            }
            else{
                System.out.println(name + " got no hurt");
            }
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(name + " died");
            return true;
        }

        return false;
    }

    public void laugh(){
        System.out.println(name + " laughs: Hahahahaha~");
    }

    public void shout(){
        System.out.println(name + " shouts: Ahhhhhhhhh~");
    }

    public void shock(){
        System.out.println(name + " shocks: 啊？");
    }

    public void move() {
        System.out.println(name + " moves");
        
        // not implemented yet

    }
}