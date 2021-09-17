public class Monster extends Creature 
{

    int magic;

    Monster(String namestr, int hp, int ap, int dp, int mp) 
    {
        name = namestr;
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    @Override
    public void attack(Creature c, int ap) 
    {
        System.out.println(this.name + ": I attack " + c + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }

    public void rolleyes()
    {
        System.out.println(this.name + ": I roll my eyes. ");
    }

    public void bePissed() 
    {
        System.out.println(this.name + ": I'm so freaking pissed. ");
    }

    public void stretchOut()
    {//伸手
        System.out.println(this.name + ": I stretch out my hand. ");
    }

   

}