package hw01;

public class Creature extends Being
{
    String name;
    int health;
    int attack;
    int defense;
    int mood = 0;  //from -10 to 10: 0 normal, 10 very happy, -10 very angry

    String[] memory;
    int memoryOffset;

    public Creature()
    {
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something)
    {
        System.out.println(name + " tells " + creature.name + " :'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something)
    {
        System.out.println(name + " heards: " + something);
        memoryOffset = memoryOffset + 1;
        memory[memoryOffset % memory.length] = something;
        reaction();
    }

    public void reaction(){
        //override in child class
    }

    public boolean recall(String something)  //recall something in memory
    {
        for(String i:memory){
            if(i==something) return true;
        }
        return false;
    }

    public boolean isDead()
    {
        return health<=0;
    }

    public void move(int dx, int dy)
    {
        location_x = location_x + dx;
        location_y = location_y + dy;
        System.out.println(name + " moves to { " + location_x + ", " + location_y + " }");
    }

    public void attack(Creature creature,String way)
    {
        System.out.println(name + " attack " + creature.name + " of " + attack + " points");
        creature.receiveAttack(attack);
    }

    public void receiveAttack(int ap)
    {
        if(defense<ap) health = health - ap;
        if(isDead()) System.out.println(name + " is dead");
        else System.out.println(name + " got " + ap + "points attack");
    }

    public void bePissed(){
        System.out.println(name + " says: I'm so freakin pissed. ");
    }

    public void beHappy(){
        System.out.println(name + " says:I am so happy. ");
    }

    public void setMood(int m){
        mood = m;
        System.out.println(name + "'s mood is " + mood);
    }
}