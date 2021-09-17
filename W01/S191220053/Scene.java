package W01.S191220053;

import W01.S191220053.GlobalVariables.EntityType;
import W01.S191220053.GlobalVariables.GlobalClassType;
import W01.S191220053.GlobalVariables.MagicStatus;

import java.util.HashSet;

import W01.S191220053.GlobalVariables.BeingStatus;
import W01.S191220053.GlobalVariables.WeaponStatus;

public class Scene {
    private static int num;
    private static Being[] allmember;

    private CalaBoy[] calaboy;
    private Human oldman;
    private Monster snake, scorpion, frog;
    private Building stonecave;

    public Scene(){
        // 人物、建筑初始化
        calaboy = new CalaBoy[8];
        calaboy[7] = new CalaBoy(30, "SeventhBro", BeingStatus.alive);
        calaboy[5] = new CalaBoy(30, "FifthBro", BeingStatus.alive);
        calaboy[4] = new CalaBoy(30, "FourthBro", BeingStatus.alive);
        oldman = new Human(20, "GrandPa", BeingStatus.alive);
        snake = new Monster(40, "SnakeMadam", BeingStatus.alive);
        scorpion = new Monster(50, "Scorpion", BeingStatus.alive);
        frog = new Monster(10, "FrogScout", BeingStatus.panic);
        stonecave = new Building(100, "StoneCave", BeingStatus.alive);

        // 人物的武器以及特殊能力
        calaboy[7].ObtainEntity(new Weapon("PurpleCalabash", EntityType.weapon, 5, 100, WeaponStatus.brandnew));
        calaboy[5].ObtainEntity(new Magic("Water", EntityType.magic, 5, MagicStatus.normal));
        calaboy[4].ObtainEntity(new Magic("Fire", EntityType.magic, 5, MagicStatus.normal));
        calaboy[4].ObtainEntity(new Magic("Lighting", EntityType.magic, 5, MagicStatus.normal));

        // 所有人物添加到全局变量组, 方便广播
        allmember = new Being[20];
        allmember[0] = calaboy[7];
        allmember[1] = calaboy[5];
        allmember[2] = calaboy[4];
        allmember[3] = oldman;
        allmember[4] = snake;
        allmember[5] = scorpion;
        allmember[6] = frog;
        allmember[7] = stonecave;
        num = 8;
    }

    public void Play(){
        calaboy[4].Attack(stonecave, "Lighting");
        frog.StatusTransition(BeingStatus.panic);
        frog.SpeakTo(snake, "报!!!大王, 这帮蛮小子打进来了!!");

        Being[] tempgroup = new Being[] {calaboy[4], calaboy[5]};
        calaboy[7].GroupBroadCast(tempgroup, "你们这帮野小子, 敢来这胡闹, 我可对你们不客气了!");
        calaboy[5].SpeakTo(calaboy[7], "弟弟,你怎么昏了头脑, 去帮两个妖精?");
        calaboy[4].SpeakTo(calaboy[7], "弟弟, 你中邪了, 怎么跟妖精混在一起?");
        calaboy[7].GroupBroadCast(tempgroup, "你们才是妖精呢, 我是妈妈的好宝贝. 谁敢欺负我的爸爸妈妈我就把它捏得粉碎");
        oldman.SpeakTo(calaboy[7], "孩子你中邪了, 快醒醒.");
        calaboy[7].SpeakTo(oldman, "你这老家伙, 再胡说八道我就要你好看!");

        SpecialEntity fire = (SpecialEntity)calaboy[4].ExertEntity("Fire", null, GlobalClassType.None);
        fire.Attack(calaboy[7]);
        calaboy[7].BroadCast("收!!!");
        calaboy[7].ExertEntity("PurpleCalabash", fire, GlobalClassType.SpecialEntity);
        calaboy[4].Attack(calaboy[7], "Fire");
        snake.SpeakTo(calaboy[7], "hahah, 你真行啊");
        calaboy[5].SpeakTo(calaboy[4], "哥哥, 看我的");
        SpecialEntity water = (SpecialEntity)calaboy[5].ExertEntity("Water", null, GlobalClassType.None);
        calaboy[7].ExertEntity("PurpleCalabash", water, GlobalClassType.SpecialEntity);
        calaboy[7].Brag("PurpleCalabash");
        SpecialEntity lighting = (SpecialEntity)calaboy[4].ExertEntity("Lighting", null, GlobalClassType.None);
        calaboy[7].ExertEntity("PurpleCalabash", lighting, GlobalClassType.SpecialEntity);
        calaboy[7].ExertEntity("PurpleCalabash", calaboy[4], GlobalClassType.CalaBoy);
        calaboy[7].ExertEntity("PurpleCalabash", calaboy[5], GlobalClassType.CalaBoy);
        calaboy[5].SpeakTo(calaboy[4], "唉你这个混蛋!");
        calaboy[4].SpeakTo(calaboy[5], "我今天要给你点颜色瞧瞧");
        calaboy[5].Attack(calaboy[4], "Water");
        fire = (SpecialEntity)calaboy[4].ExertEntity("Fire", null, GlobalClassType.None);
        water = (SpecialEntity)calaboy[5].ExertEntity("Water", null, GlobalClassType.None);
        fire.Attack(water);
        water.Attack(fire);
        calaboy[7].SpeakTo(snake, "哈哈哈, 妈, 你看他们都打起来了");
    }

    public static void BroadCastMessage(Being src, String message){
        for (int iter = 0; iter < num; ++iter){
            // 广播不发给自己
            if (allmember[iter].UnitName() != src.UnitName())
                allmember[iter].ReceiveDialog(message);
        }
    }

    public static void GroupBroadCastMessage(Being[] target, String message){
        HashSet<Being> set = new HashSet<Being>();
        for (var iter : target)
            set.add(iter);
        for (int iter = 0; iter < num; ++iter)
            if (set.contains(allmember[iter]))
                allmember[iter].ReceiveDialog(message);
    }

    public static void main(String[] args) {
        // P12 -《妖迷心窍》
        // 3:28 ~ 3:38 : <序幕> 葫芦娃4、5娃打进妖精洞穴
        // 3:57 ~ 4:30 : <中章> 人物对话演示(广播、组播)
        // 4:30 ~ 5:57 : <高潮> 战斗演示
        new Scene().Play();
    }
}
