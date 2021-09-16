public class CalabashBrothers extends Creature
{//葫芦兄弟类
    int identity;// 1~7号标识7个葫芦娃

    public CalabashBrothers(String namestr, int number)
    {
        this.name = namestr;
        this.identity = number;
    }

    public void somersault() 
    {//翻跟斗
        System.out.println(this.name + ": I turn a somersault. ");
    }

    public void useClairvoyance()
    {//千里眼
        if(this.identity != 2) {return;}//二娃天赋

        System.out.println(this.name + ": I use clairvoyance to see something. ");
    }

    public void useClairaudience()
    {//顺风耳
        if(this.identity != 2) {return;}//二娃天赋

        System.out.println(this.name + ": I use clairaudience to hear something. ");
    }
}