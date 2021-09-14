public class Creature
{
    int health;
    int attack;
    int defense;
    int speed;
    String name;
    String[] memory;
    int memoryOffset;

    public Creature() 
    {
        memory = new String[20];
        memoryOffset = 0;
    }

    public void speak(Creature creature, String words) 
    {
        System.out.println(name + " tell " + creature.name + ": '" + words + "'");
        creature.listen(words);
    }

    public void listen(String words) 
    {
        //System.out.println(name + " heard: " + words);
        memory[memoryOffset] = words;
        memoryOffset = (memoryOffset + 1) % memory.length;
    }

    public void receiveDamage(int damage) 
    {
        if (!isDead()) 
        {
            if (defense < damage) 
            {
                health -= (damage - defense);
                System.out.println( name + " got " + (damage - defense) + " points attack.");
            }
        }
    }
    public void run()
    {
        speed += 2;
        System.out.println(name + " run away.");
    }

    public void getTreasure(Treasure treasure)
    {
        System.out.println(name + " pick up " + treasure.name);
    }

    public boolean isDead() 
    {
        if (health <= 0) 
        {
            System.out.println(name + " am dead.");
            return true;
        }
        return false;
    }


}