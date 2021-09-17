package Feng;
import java.util.HashSet;
import java.util.Set;

public class PurpleGourd extends MagicWeapon
{
    private Set<Being> beingsSet;
    PurpleGourd()
    {
        super("the PurpleGourd");
        beingsSet = new HashSet<Being>();
    }
    PurpleGourd(Being sth)
    {
        super("the PurpleGourd");
        beingsSet = new HashSet<Being>();
        beingsSet.add(sth);                   
    }
    public void Glitter()
    {
        System.out.println(m_name + " glittered with magic...\n");
    }
    public void SuckIn(Being something)
    {
        if(!beingsSet.contains(something))
        {
            if(beingsSet.add(something))
            {
                System.out.println(something.Name()
                 + " is sucked into " + m_name + "\n");
            }
        }
    }
    public void Release(Being sth)
    {
        if(beingsSet.contains(sth))
        {
            if(beingsSet.remove(sth)){
                System.out.println(m_name + 
                " released " + sth.Name() + "\n");
            }          
        }
    }
}