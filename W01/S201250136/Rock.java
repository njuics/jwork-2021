package W01.S201250136;

/*
 * @Descripttion: 
 * @version: 
 * @Author: Lian Jianheng
 * @Date: 2021-09-12 09:30:44
 * @LastEditors: 
 * @LastEditTime: 2021-09-12 09:30:45
 */
public class Rock extends Being
{
    private int aggressivity;
    public Rock(String name, int aggressivity)
    {
        super(name);
        this.aggressivity = aggressivity;
    }
    int attack()
    {
        System.out.println("岩石掉下来了！！");
        return aggressivity;
    }
}
