package W01.S201250136;

/*
 * @Descripttion: 
 * @version: 
 * @Author: Lian Jianheng
 * @Date: 2021-09-12 09:29:07
 * @LastEditors: Please set LastEditors
 * @LastEditTime: 2021-09-12 09:29:07
 */
public abstract class Being
{
    String name;
    public Being()
    {

    }
    public Being(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}