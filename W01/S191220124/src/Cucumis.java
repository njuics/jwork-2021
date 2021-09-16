public class Cucumis extends Creature {
    Cucumis(String _name,int hp,int atk,int def)
    {
        name=_name;
        health=hp;
        attack=atk;
        defense=def;
    }
    void strengthen()
    {
        System.out.printf("%s强化了自己,力量增强!\n",name);
        attack*=2;
    }
    void beScorned()
    {
        System.out.printf("%s:不屑\n",name);
    }
}
