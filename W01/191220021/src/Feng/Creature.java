package Feng;

public class Creature extends Being
{
    private float m_health;
    private float m_maxHealth;
    protected int m_emotionPoints;

    Creature (String name, float maxHealth)
    {
        if(name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("\033[1;91m invalid name!\033[0m");          
        }
        else 
        {
            m_name = name;
            m_health = maxHealth;
            m_maxHealth = maxHealth;
            m_emotionPoints = 0;         
        }
       
    }

    public void Speak2(String words, Creature target)
    {
        if(words == null) return;
        if(target != null)
        {
            System.out.println("\033[0;32m" + m_name + " tell " + target.Name() + ": \033[0m" + words);
        }
        else System.out.println("\033[0;32m" + m_name + ": \033[0m" + words);
    }
    
    public void Grieve()
    {
        if(!IsDead())
        {
            System.out.println(m_name + " feels sad...\n");
            m_emotionPoints -= 1;
        }
        
    }

    public void Laugh()
    {
        if(!IsDead())
        {
            System.out.println("\033[0;32m" + m_name + ": \033[0mHahaha~");
            m_emotionPoints += 1;
        }
    }

    public void RollTheEyes()
    {
        if(!IsDead())
        {
            System.out.println(m_name + " rolls eyes...\n");
        }
    }

    public void Move(Being target)
    {
        if(!IsDead())
        {
            System.out.println(m_name + " is moving towards " + target.Name() + "\n");
        }
    }

    protected void TakeDamage(float damage, Being damageSource)
    {
        if(!IsDead())
        {
            m_health -= (m_health < damage) ? m_health : damage;
            System.out.println("\033[0;31m>" + m_name + " take " + damage + " points of damage from " + damageSource.Name() + ".\033[0m");       
        }
        if(IsDead())
        {
            System.out.println("\033[0;31m>" + m_name + " died...\033[0m");
        }
    }
    
    private boolean IsDead()
    {
        return m_health == 0;
    }

    public void Heal(float healValue)
    {
        m_health = (m_health + healValue) > m_maxHealth ? m_maxHealth : m_health+healValue; 
    }
}