public class Weapon extends Being{
    int durability;
    Weapon()
    {
        name="null";
        durability=0;
    }
    void beDamaged()
    {
        System.out.printf("%sèä¹éä½\n",name);
    }
}
