
enum emotions{normal,angry,happy};
public class Creature {
    String name;  //名字
    int HP;   //生命值
    int attack_value;  //攻击力
    int defense;  //防御力
    int agile; //敏捷度
    emotions emotion; //情绪
    Creature()
    {
        name=null;
        HP=100;
        attack_value=10;
        defense=0;
        agile=0;
        emotion=emotions.normal;
    }
    
    public void talkto(Creature someone,String someword)
    {
        System.out.println(name + " tells " + someone.name + ": " + someword);
    }

    public void shout(String someword)
    {
        System.out.println(name + " shout: " + someword);
    }
    public void gethurt(int value)
    {
        if(HP>value)
        {
            HP-=value;
        }
        else
        {
            HP=0;
            System.out.println(name + " is dead------");
        }
    }

    public void hit(Creature someone,int value){
        System.out.println(name + " hit " + someone.name + " " + value + "HP");
        someone.gethurt(value);
    }

    public void change_emotion(emotions a)
    {
        emotion=a;
        System.out.println(this.name + " become " + a);
    }

    public boolean isDead()
    {
        return (HP<=0);
    }

    public void run_away()
    {
        System.out.println(name + " run away~~~~");
    }
}