public class Weapon extends Being{
    int durability;
    Weapon()
    {
        name="null";
        durability=0;
    }
    void beDamaged()
    {
        System.out.printf("%s耐久降低\n",name);
    }
}
