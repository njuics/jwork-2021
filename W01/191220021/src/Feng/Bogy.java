package Feng;

public class Bogy extends Creature
{
    private float baseDamage; 
    Bogy(String name, float maxHealth, float baseDamage)
    {
        super(name, maxHealth);
        this.baseDamage = baseDamage;
    }

    public void Attack(Creature atkTarget)
    {
        if(atkTarget != null)
        {
            System.out.println(m_name + " attacked " + atkTarget.Name() + ":");
            atkTarget.TakeDamage(baseDamage, this);
        }
    }

    public void Hug(Creature hugTarget)
    {
        if(hugTarget != null)
        {
            System.out.println(m_name + " hugged " + hugTarget.Name() + "\n");
        }
    }

    public void Kiss(Creature target)
    {
        if(target != null)
        {
            System.out.println(m_name + " gives " + target.Name() + " a kiss\n");
        }
    }
}