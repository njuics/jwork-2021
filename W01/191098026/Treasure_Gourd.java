public class Treasure_Gourd extends Treasure 
{
    boolean active;
    public Treasure_Gourd()
    {
        name = "gourd";
        active = true;
    }

    public void spitFire(Creature... args)
    {
        if (active)
        {
            System.out.println("Gourd spits fire");
            for(Creature creature:args)
                creature.receiveDamage(30);
        }
    }

    public void getLeaf(Creature creature)
    {
        if (creature.name == "leaf") active = false;
    } 

    public Treasure_Gourd_Seed becomeSeed()
    {   if (active == false)
        {
            System.out.println("Gourd becomes a seed");
            return new Treasure_Gourd_Seed();
        }
        return null;
    }
}