package W01.S201250136;

import W01.S201250136.Creature;

/**
 * @author ljh
 * @create 2021-09-12 19:35
 */
public class NormalCreature extends Creature
{
    public NormalCreature()
    {
    }

    public NormalCreature(String name, int hp, int defense, int aggressivity)
    {
        super(name, hp, defense, aggressivity);
    }

    @Override
    public void think()
    {
        System.out.println(name + "认真的思考");
    }

    @Override
    public void laugh()
    {
        System.out.println("吼吼吼");
    }
}
