public class GourdBaby extends Creature{

    GourdBaby(int LH, int BH,String na){
       blood_volume=300;
       weapon_num=0;
       level=0;
       Defense=false;
       LittleHarm=LH;
       BigHarm=BH;
       name=na;
       death=false;
    }

    public void NonBloodAttack(Creature creature ,String skill){
        System.out.println(name+"向"+creature.name+"发动技能："+skill);
        System.out.println(creature.name+"战力值下降");
        creature.weapon_num--;
        creature.LittleHarm-=20;
        creature.BigHarm-=20;
    }

    public void NonFightAttack(String skill){
        System.out.println(name+"发动技能："+skill);
    }

    public void DefenseSkill(String skill){
        System.out.println(name+"发动防御技能："+skill);
        Defense=true;
    }


}