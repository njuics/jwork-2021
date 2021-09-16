package W01.S181870286;

import java.util.ArrayList;

public class Scene {
    HuLuWa yiwa, erwa, sanwa, siwa, wuwa, liuwa, qiwa;
    Human oldman;
    BigMonster scorpion, snake;
    LittleMonster bee0, bee1, bee2, frog0, frog1;
    Entity rock0, rock1, knife, rock2, sword;
    Wand asyouwish;

    Scene() {
        yiwa = new HuLuWa("一娃");
        sanwa = new SanWa();
        siwa = new SiWa();
        wuwa = new WuWa();
        erwa = new HuLuWa("二娃");
        liuwa = new HuLuWa("六娃");
        qiwa = new HuLuWa("七娃");
        oldman = new Human("爷爷");
        scorpion = new BigMonster("蝎子精");
        snake = new BigMonster("蛇精");
        bee0 = new LittleMonster("毒蜂一号");
        bee1 = new LittleMonster("毒蜂二号");
        bee2 = new LittleMonster("毒蜂三号");
        frog0 = new LittleMonster("蛤蟆一号");
        frog1 = new LittleMonster("蛤蟆二号");
        knife = new Entity("匕首", 50, 50);
        rock0 = new Entity("石头", 300, 100);
        rock1 = new Entity("石头", 300, 100);
        rock2 = new Entity("石尖", 300, 100);
        sword = new Entity("大刀", 200, 50);
        asyouwish = new AsYouWish();
    }

    void play() {
        scorpion.holdWeapon(knife);
        scorpion.holdArmour(oldman);
        scorpion.say("你们谁敢胡来,我先宰了这老头!");
        oldman.say("孩子..别管我..快去消灭妖精.");
        snake.holdWand(asyouwish);
        snake.useWandTo(new Entity[] { yiwa, erwa, sanwa, siwa, wuwa, liuwa, qiwa });
        siwa.attack(asyouwish);
        yiwa.holdArmour(rock0);
        bee0.attack(yiwa);
        bee1.attack(yiwa);
        bee2.attack(yiwa);
        siwa.bigmove(new Entity[] { bee0, bee1, bee2 });
        frog0.holdWeapon(sword);
        frog0.say("嘿！");
        frog0.attack(sanwa);
        sanwa.say("哈！");
        sanwa.attack(sword);
        frog0.fallTo(rock2);
        yiwa.holdWeapon(rock1);
        yiwa.throwTo(frog1);
    }
    public static void main(String[] args){
        new Scene().play();
    }
}
