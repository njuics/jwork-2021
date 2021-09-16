package W01.S201250136;

import W01.S201250136.Being;

public class Magic extends Being
{
    String magicName;
    int attackAdd;
    public Magic(String magicName, int attackAdd)
    {
        this.magicName = magicName;
        this.attackAdd = attackAdd;
    }
    public String toString()
    {
        return this.magicName;
    }
    public int useMagic()
    {
        System.out.println("看法宝");
        return attackAdd;
    }
}