package W01.S201250136;

import W01.S201250136.Creature;
import W01.S201250136.Magic;

import java.util.HashMap;

/*
 * @Descripttion: 
 * @version: 
 * @Author: Lian Jianheng
 * @Date: 2021-09-12 10:06:39
 * @LastEditors: Please set LastEditors
 * @LastEditTime: 2021-09-12 17:26:51
 */
public class Monster extends Creature
{
    HashMap<String, Magic> myMagics;
    public Monster(String name, int hp, int defense, int aggressivity)
    {
        super(name, hp, defense, aggressivity);
        myMagics = new HashMap<>();
    }

    public void addMagic(String name, Magic magic)
    {
        myMagics.put(name, magic);
    }

    @Override
    public void think()
    {
        System.out.println(name + "转眼珠");
    }

    @Override
    public void laugh()
    {
        System.out.println(name + "笑得阴险极了，桀桀桀");
    }
}
