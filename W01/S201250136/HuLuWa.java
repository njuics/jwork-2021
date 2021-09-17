package W01.S201250136;

import W01.S201250136.Creature;

import java.util.HashMap;

/**
 * @author ljh
 * @create 2021-09-12 19:30
 */
public class HuLuWa extends Creature
{
    HashMap<String, Magic> myMagics;
    boolean status;//fasle意味着此时位葫芦形态
    public HuLuWa(String name, int hp, int defense, int aggressivity, boolean status)
    {
        super(name, hp, defense, aggressivity);
        this.myMagics = new HashMap<>();
        this.status = status;
    }

    public void addMagic(String name, Magic magic)
    {
        myMagics.put(name, magic);
    }
    @Override
    public void think()
    {
        System.out.println(name + "慎重的思考");
    }
    public void transferToHuLu()
    {
        this.status = false;
    }
    public void transferToWa()
    {
        this.status = true;
    }

    @Override
    public boolean isDead()
    {
        System.out.println("葫芦娃是不会灭亡的！！");
        return false;
    }

    @Override
    public void run()
    {
        System.out.println("急速飞行中...");
    }

    @Override
    public void laugh()
    {
        System.out.println("葫芦娃笑得开心极了");
    }
    public void jump()
    {
        System.out.println(name + "开始旋转跳跃了");
    }
}
