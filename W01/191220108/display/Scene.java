public class Scene{

    StoneDoor stonedoor;
    Monster BeeMen;//一群蜜蜂怪
    Monster BlueToad;//蓝蛤蟆精
    Monster RedToad;//红蛤蟆精
    Monster Lizards;//蜥蜴精
    Monster Centipede;//蜈蚣精
    Boss Scorpion;//蝎子精
    Boss Snake;//蛇精
    GourdBaby FirstRed;//大娃
    GourdBaby SecondOrange;//二娃
    GourdBaby ThirdYellow;//三娃
    GourdBaby FourthGreen;//四娃

    public Scene(){
        stonedoor = new StoneDoor();

        BeeMen = new Monster(50, 0, 0, 10, 20, "一群蜜蜂精");
        BlueToad = new Monster(150, 1, 1, 30, 50, "蓝蛤蟆精");
        RedToad = new Monster(150, 1, 1, 30, 50, "红蛤蟆精");
        Lizards = new Monster(100, 0, 0, 20, 20, "蜥蜴精");
        Centipede = new Monster(300, 2, 2, 50, 100, "蜈蚣精");

        Scorpion = new Boss("蝎子精");
        Snake = new Boss("蛇精");

        FirstRed = new GourdBaby(70, 140, "大娃");
        SecondOrange = new GourdBaby(50, 80, "二娃");
        ThirdYellow = new GourdBaby(60, 130, "三娃");
        FourthGreen =  new GourdBaby(75, 150, "四娃");

    }

    public void Play(){
        System.out.println("七个葫芦娃团结一致，踏上了打怪升级，拯救爷爷的旅途……");
        System.out.println();

        System.out.println("前方出现一群恼人的蜜蜂精");
        System.out.println();
        FirstRed.DefenseSkill("大力出奇迹之借物挡灾");
        System.out.println();
        BeeMen.BigAttack(FirstRed, "屁股毒箭");
        System.out.println();
        System.out.println("四娃前来增援！");
        System.out.println();
        FourthGreen.BigAttack(BeeMen, "三昧真火");
        System.out.println();

        System.out.println("继续前进……");
        System.out.println();
        System.out.println("一只蓝蛤蟆精大叫着冲来！");
        System.out.println();
        BlueToad.Attack(ThirdYellow);
        System.out.println();
        ThirdYellow.Attack(BlueToad);
        System.out.println();
        BlueToad.Attack(ThirdYellow);
        System.out.println();
        ThirdYellow.Attack(BlueToad);
        System.out.println();
        BlueToad.Attack(ThirdYellow);
        System.out.println();
        ThirdYellow.NonBloodAttack(BlueToad, "铁臂斩");
        System.out.println();
        ThirdYellow.Attack(BlueToad);
        System.out.println();
        System.out.println("不自量力的蓝蛤蟆精最终惨死于锥形石柱上！");
        System.out.println();

    
        System.out.println("大娃进行一波打野，战力提升！");
        System.out.println();
        FirstRed.FightWildAnimal();
        System.out.println("红蛤蟆精和蜥蜴精惨死于大娃的天外飞石！");
        System.out.println();

        Scorpion.Speak("快跑！");
        System.out.println();
        stonedoor.open();
        System.out.println();
        Scorpion.Escape();
        System.out.println();
        Snake.Escape();
        System.out.println();
        stonedoor.close();
        System.out.println();

        System.out.println("半路杀出个蜈蚣精！");
        System.out.println();
        Centipede.Attack(FirstRed);
        System.out.println();
        FirstRed.Attack(Centipede);
        System.out.println();
        Centipede.Attack(FirstRed);
        System.out.println();
        FirstRed.NonBloodAttack(Centipede, "摧毁武器");
        System.out.println();
        FirstRed.Attack(Centipede);
        System.out.println();
        Centipede.Attack(FirstRed);
        System.out.println();
        FirstRed.NonBloodAttack(Centipede, "摧毁武器");
        System.out.println();
        System.out.println("可怜的小蛇，未成精就被飞来的斧头砍成了两半！");
        System.out.println();
        Centipede.Run();
        System.out.println();
        FirstRed.Speak("哪里跑！");
        System.out.println();
        Centipede.LevelUp("变身巨人");
        System.out.println();
        Centipede.BigAttack(FirstRed, "巨人之力");
        System.out.println();
        FirstRed.BigAttack(Centipede, "大力撕扯");
        System.out.println();
        FirstRed.BigAttack(Centipede, "大力撕扯");//验证技能一次够不够
        System.out.println();

        System.out.println("路上的小怪已被铲除");
        System.out.println();
        System.out.println("爷爷在哪里？！");
        System.out.println();
        SecondOrange.NonFightAttack("千里眼");
        System.out.println();
        System.out.println("爷爷，坚持住！葫芦娃来了……");

    }

    public static void main(String []args){
        new Scene().Play();
    }
}