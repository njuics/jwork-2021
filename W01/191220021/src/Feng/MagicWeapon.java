package Feng;

public class MagicWeapon extends Being
{
    MagicWeapon(String name)
    {
        if(name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("\033[1;91m invalid name!\033[0m");          
        }
        else 
        {
            m_name = name;       
        }
    }
}