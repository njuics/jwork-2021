package W01.S201250136;

public abstract class Creature extends Being
{
    int hp;
    int defense;
    int aggressivity;
    public Creature()
    {

    }
    public Creature(String name, int hp, int defense, int aggressivity)
    {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.aggressivity = aggressivity;
    }
    public void speakTo(Creature targeCreature, String word)
    {
        System.out.println(name + "说:“" + word + "”\n");
    }
    public void attack(Creature targeCreature)
    {
        System.out.println(name + "打了" + targeCreature.name);
        targeCreature.wasAttack(this.aggressivity);
    }
    public void attack(Creature targetCreature, Magic magic)
    {
        System.out.println(name + "使用了" + magic + ", 不起作用");
        targetCreature.wasAttack(magic.attackAdd + this.aggressivity);
    }
    public void attack(Creature targetCreature, Rock rock)
    {
        System.out.println(name + "使用了岩石攻击, 效果拔群");
        targetCreature.wasAttack(rock.attack() + this.aggressivity);
    }
    public void wasAttack(int aggressivity)
    {
        int reduceBlood = aggressivity / defense;
        hp -= reduceBlood;
        System.out.println(name + "被打掉了" + reduceBlood);
        if(this.isDead())
        {
            System.out.println(name + "死了");
        }
    }
    public boolean isDead()
    {
        return this.hp <= 0;
    }
    public void run()
    {
        System.out.println(name + "跑起来了");
    }
    public void beingPissed(Creature targetCreature)
    {
        System.out.println(targetCreature.name + "，我" + name + "真的生气了");
    }
    public void stop()
    {
        System.out.println(name + "撞到了什么东西");
    }

    public abstract void laugh();

    public abstract void think();
}