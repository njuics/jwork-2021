public class Monster extends Creature {
    Weapon weapon;
    Monster(String _name,int hp,int atk,int def)
    {
        name=_name;
        health=hp;
        attack=atk;
        defense=def;
        weapon=null;
    }
    void strengthen()  //强化能力
    {
        System.out.printf("%s强化了能力!",name);
        attack*=2;
    }
    void missedAttack(Creature c)
    {
        System.out.printf("%s攻击%s,被闪避\n",name,c.name);
    }
    void equipWeapon(Weapon w)
    {
        weapon=w;
        System.out.printf("%s拿起了%s\n",name,w.name);
    }
    void unequipWeapon()
    {
        System.out.printf("%s丢掉了%s\n",name,weapon.name);
        weapon=null;
    }
    void beScared()
    {
        System.out.printf("%s陷入惊恐\n",name);
    }
    void escape()
    {
        System.out.printf("%s逃跑了!\n",name);
    }

}
