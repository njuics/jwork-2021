package S191220159;

public class Scene {
    SixWa sixwa;
    Monster FrogMonster;
    Monster WugongMonster;
    Monster BatMan;
    Item door;
    Item flagon;
    Item nail;
    Item web;

    public Scene() {
        sixwa = new SixWa("六娃", 0);
        BatMan = new Monster("蝙蝠兵");
        FrogMonster = new Monster("青蛙精");
        WugongMonster = new Monster("蜈蚣精");
        web = new Item("蜘蛛网");
        nail = new Item("钉子");
        door = new Item("大门");
        flagon = new Item("酒壶");
    }

    public void play() {
        sixwa.pick(flagon);
        sixwa.use(flagon, FrogMonster);
        sixwa.drop(flagon);
        FrogMonster.move(door);
        door.open();
        sixwa.hide();
        FrogMonster.pick(flagon);
        sixwa.move(door);
        FrogMonster.move(door);
        door.close();
        FrogMonster.kick(flagon, WugongMonster);
        WugongMonster.speakTo(FrogMonster, "谁?");
        FrogMonster.speakTo(WugongMonster, "哈哈哈哈哈，我扔了个空酒壶，又惹到你们了，大惊小怪！");
        sixwa.pick(nail);
        sixwa.use(nail, WugongMonster);
        WugongMonster.speakTo(BatMan,"你在这儿守着，别走开啊！");
        WugongMonster.move(nail);
        WugongMonster.speakTo(BatMan,"可别打盹！把眼睛睁大点！");
        WugongMonster.move(nail);
        sixwa.drop(nail);
        nail.stab(WugongMonster);
        WugongMonster.triggar(web);
        FrogMonster.speakTo(WugongMonster,"哈哈，又掉进网里了吧！");
        sixwa.show();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}