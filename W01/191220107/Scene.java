public class Scene {

    Trap trap;
    SpiderWeb spider_web;
    Stone stone;
    Human oldman;
    Monster monster;
    Soldier soldier1, soldier2, soldier3;
    Pangolin pangolin;

    public Scene() {
        trap = new Trap("trap that shoots");
        spider_web = new SpiderWeb("spider web in the cave");
        stone = new Stone("stone by the opening");
        oldman = new Human("old Man");
        monster = new Monster("the scorpion");
        soldier1 = new Soldier("soldier with a patch");
        soldier2 = new Soldier("soider who's brave");
        soldier3 = new Soldier("soider who's a bug");
        pangolin = new Pangolin("the friendly pangolin");
    }

    public void play() {
        pangolin.cleanObstruction(trap);
        pangolin.cleanObstruction(spider_web);
        soldier2.yawn();
        soldier1.speakTo(soldier2, "大王叫我们严加防守，可不能马虎啊");
        soldier1.speakTo(soldier2, "上回，那葫芦蛮小子闯进大门，大王怪罪下来，一巴掌差点没把我打死，算我命大");
        System.out.println("a mouse comes out of the cave.");
        soldier1.speak("不好，有情况");
        soldier2.speakTo(soldier1, "啊，原来是只小老鼠");
        soldier2.speakTo(soldier1, "老兄，你被葫芦娃吓得，胆子比这耗子还小啊，哈哈哈哈");
        pangolin.cleanObstruction(stone);
        pangolin.speak("快走");
        pangolin.move();
        oldman.move();
        oldman.stumble();
        soldier1.move();
        soldier2.move();
        soldier1.speak("站住");
        soldier2.speak("站住");
        pangolin.speak("你们别想抓住我");
        pangolin.move();
        soldier1.move();
        soldier2.move();
        monster._catch(pangolin);
        pangolin.speak("啊啊啊啊");
        monster.speakTo(pangolin, "嘿嘿嘿嘿");
        pangolin.speak("你们这些坏蛋");
        monster._throw(pangolin);
        soldier1.arrest(pangolin);
        soldier2.arrest(pangolin);
        soldier3.speakTo(monster, "报告大王，大事不好，老头与瞎眼葫芦逃跑啦");
        monster.angry();
        monster.attack(pangolin);
        pangolin.isDead();
        oldman.cry();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
