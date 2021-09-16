enum antweapons{spear,arrow};
public class Antman extends Creature{
    antweapons weapon;
    Antman()
    {
        super();
        weapon=antweapons.spear;
    }
    Antman(String name)
    {
        super();
        weapon=antweapons.spear;
        this.name=name;  //名字
    }
    public void change_weapon(antweapons weapon)
    {
        this.weapon=weapon;
        if(weapon==antweapons.spear)
        {
            attack_value=10;
        }
        else{
            attack_value=15;
        }
    }
    public void hit(Creature someone) {
        if(weapon==antweapons.spear)
        {
            System.out.println(this.name + " hit " + someone.name + " with spear");
            someone.gethurt(10);
        }
        else{
            System.out.println(this.name + " hit " + someone.name + " with arrow");
            someone.gethurt(15);
        }
    }
}