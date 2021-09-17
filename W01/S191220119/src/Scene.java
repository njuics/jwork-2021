public class Scene{
    Monster toadMonster;            //癞蛤蟆
    Monster centipedeMonster;       //蜈蚣
    Human waSixHuman;               //六娃
    Weapon tridentWeapon;           //三叉戟
    Weapon maceWeapon;              //狼牙棒
    Stone smallStone;               //石块
    public Scene() {
        toadMonster = new Monster("癞蛤蟆", 10, 2, 2, 1);
        centipedeMonster = new Monster("蜈蚣精", 10, 3, 1, 1);
        waSixHuman = new Human("六娃", 50, 5, 5);
        tridentWeapon = new Weapon("三叉戟", 1);
        maceWeapon = new Weapon("狼牙棒", 1);
        smallStone = new Stone();
    }

    public void play() {
        waSixHuman.speakTo(toadMonster, "哈哈哈你来抓我吧，抓不着我了吧，我在这呢，哈哈哈");
        toadMonster.speakTo(waSixHuman, "好哇，你往哪里跑！");
        toadMonster.attack(waSixHuman, 0, tridentWeapon);
        centipedeMonster.speakTo(waSixHuman, "看你往哪走");
        centipedeMonster.speakTo(centipedeMonster, "诶，在哪呢");
        waSixHuman.speakTo(centipedeMonster, "我在这呢");
        waSixHuman.attack(centipedeMonster, 2, smallStone);
        centipedeMonster.speakTo(waSixHuman, "我的妈呀，你饶了我吧");
        waSixHuman.attack(centipedeMonster, 3, maceWeapon);
        waSixHuman.speakTo(centipedeMonster, "你们这些妖精，无恶不作，捉了我兄弟，害我爷爷，我今天要好好教训你们这群混蛋");
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}