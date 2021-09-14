public class Leaf extends Creature
{
    public Leaf()
    {
        name = "leaf";
        attack = 0;
        defense = 0;
        health = 1;
        speed = 0;
    }

    public void appear()
    {
        System.out.println("leaf appears");
    }
}