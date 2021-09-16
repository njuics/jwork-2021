public class Creature extends Being 
{

    String name; //生物名称
    int health; //健康值小于0 即为死亡
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature() 
    {
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) 
    {
        System.out.println(this.name + ": I tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void yell(String something)
    {
        System.out.println(this.name + ": I yell " + "'" + something + "'");
    }

    public void listen(String something) 
    {
        System.out.println(this.name + ": I heard " + "'" + something + "'" );
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) 
    {
        System.out.println(this.name + ": I attack " + creature.name + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void receiveAttack(int ap) 
    {
        if (!isDead()) 
        {
            if (defense < ap) 
            {
                health -= ap;
                System.out.println(this.name + ": I got " + ap + "points attack");
            }
        }
    }

    public boolean isDead() 
    {

        if (health <= 0) 
        {
            System.out.println(this.name + ": I am dead");
            return true;
        }

        return false;
    }

    public void jumpUp()
    {
        System.out.println(this.name + ": I jump up");
    }
    public void move() 
    {

        // not implemented yet

    }

}