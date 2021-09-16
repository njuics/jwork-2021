
public class Tool extends Object{
    int durability;
    int damage;

    public String Get_Name()
    {
        return this.name;
    }

    public int Damage()
    {
        if(this.durability == 0)
        {
            System.out.println("");
        }
        return this.damage;
    }
}
