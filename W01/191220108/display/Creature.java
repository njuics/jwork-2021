public class Creature extends Being{
    int blood_volume;//血槽
    int weapon_num;//武器个数
    int level;//等级
    int LittleHarm;//普通攻击伤害点数
    int BigHarm;//发动技能伤害点数
    boolean Defense;//是否有防御机制
    boolean death;//是否死亡

    String name;//名字
    //string opponent;

    //发动技能的攻击
    public void BigAttack(Creature creature,String skill){
        if(creature.death){
            System.out.println(name+"已扑街，攻击无效");
            return;
        }
        System.out.println(name+"向"+creature.name+"发动技能："+skill);
        creature.ReceiveInjury(creature,BigHarm);
        if(isdead(creature)){
            System.out.println(creature.name+"扑街");
        }

    }

    //发动提升战力的技能
    public void LevelUp(String skill){
        LittleHarm+=20;
        BigHarm+=40;
        blood_volume+=50;
        System.out.println(name+"发动技能："+skill);
    }



    //普通伤害
    public void Attack(Creature creature){
        if(creature.death){
            System.out.println(name+"已扑街，攻击无效");
            return;
        }
        System.out.println(name+"向"+creature.name+"发动普通攻击");
        creature.ReceiveInjury(creature,LittleHarm);
        if(isdead(creature)){
            System.out.println(creature.name+"扑街");
        }

    }

    
    //承伤
    public void ReceiveInjury(Creature creature,int ap){
        if(creature.Defense){
            creature.Defense=false;
            System.out.println("对方开启防御，攻击无效");
            return;
        }
        if(!isdead(creature)){
            blood_volume-=ap;
            System.out.println("输出"+ap+"点伤害");
        }
        else{
            System.out.println(name+"扑街");
        }
       
    }


    //判断死亡，血槽为空
    public boolean isdead(Creature creature){
        if(creature.blood_volume<=0){
            level++;
            blood_volume+=20;
            LittleHarm+=10;
            BigHarm+=20;
            creature.death=true;
            return true;
        }
        else return false;
    }


    //打野长经验
    public void FightWildAnimal(){
        level++;
        blood_volume+=50;
        LittleHarm+=10;
        BigHarm+=20;
    }

    //逃跑
    public void Run(){
        System.out.println(name+"弃甲而逃");
    }

    //说话
    public void Speak(String says){
        System.out.println(name+"喊道："+says);

    }


}