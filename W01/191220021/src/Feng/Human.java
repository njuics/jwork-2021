package Feng;

public class Human extends Creature
{
    Human(String name, float maxHealth)
    {
        super(name,maxHealth);
    }
    public void Cry()
    {
        System.out.println(m_name + " is weeping... T_T\n");
        m_emotionPoints -= 2;
    }
}