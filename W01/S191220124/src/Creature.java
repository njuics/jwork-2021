public class Creature extends Being {
    int health;
    int attack;
    int defense;
    Creature()
    {
        health=0;
        attack=0;
        defense=0;
        name="null";
    }
    void attack(Creature sth)
    {
        if (attack>sth.defense){
            sth.health-=(attack-sth.defense);
            System.out.printf("%s对%s造成伤害\n",name,sth.name);
        }
        else
        {
            System.out.printf("%s对%s发动攻击，但攻击无效\n",name,sth.name);
        }
    }
    void attack(Weapon sth)
    {
        sth.durability-=attack;
        System.out.printf("%s攻击%s,%s的耐久降低\n",name,sth.name,sth.name);
        if(sth.durability<0)
            System.out.printf("%s损坏了!\n",sth.name);
    }
    void laugh()
    {
        System.out.printf("%s大笑\n",name);
    }
    void bePissed()
    {
        System.out.printf("%s发怒了!\n",name);
    }


}
