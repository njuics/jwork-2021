package W01.S191220055;

public class Scene {

    SpiderWeb spiderWeb;
    Human oldman;
    Human huluwa; //二娃
    Pangolin pangolin;//穿山甲
    Monster centipede; //蜈蚣
    Monster spider;

    public Scene() {
        //环境
        spiderWeb = new SpiderWeb();

        //葫芦娃阵营
        oldman = new Human("grandpa",100,0,0);//并未涉及攻击和防御
        huluwa = new Human("erwa",100,0,0);
        pangolin = new Pangolin(100, 10, 20);

        //怪物阵营
        centipede = new Monster("centipede", 100, 20, 0);
        spider = new Monster("spider",100,0,0);
    }

    public void play() {
        // 发现怪物正在追来
        spider.sleep();
        centipede.lookForTarget();
        huluwa.useWindAccompanyingEar("怪物正在追赶而来");
        oldman.speak("怎么了？");
        huluwa.speak("不好了，我听到后面有妖精追来了"); 
        pangolin.speak("老爷爷，你们快躲一躲，我有办法对付");
        oldman.hide();
        huluwa.hide();

        // 斗智斗勇
        pangolin.bait();
        centipede.rolleyes();
        centipede.attack(pangolin,0,false);
        pangolin.hide();
        centipede.lookForTarget();
        pangolin.attack(centipede,20,true);
        spiderWeb.capture(centipede);
        centipede.speak("快放开我");
        spider.wakeup();
        spider.drawWeb();
        spider.speak("又有一个瞎眼的傻瓜送上门来了");
        centipede.speak("你们这些瞎眼的混蛋，快放开我");

        // 顺利逃脱
        pangolin.run();
        oldman.run();
        huluwa.run();
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
