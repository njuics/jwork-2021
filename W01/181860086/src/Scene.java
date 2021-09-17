public class Scene {
    public Scene() {
        thirdBaby = new ThirdBaby("三娃");
        monster = new Monster("蝎子精");
        knife = new Being("刀");
        ground = new Being("地");
    }
    public void play() {
        monster.hold(knife);
        thirdBaby.angry(1);
        thirdBaby.attack(thirdBaby.body, monster);
        monster.fallOn(ground);
        thirdBaby.laugh(false);
        monster.climbUp(ground);
        monster.angry(1);
        monster.attack(knife, thirdBaby);
        thirdBaby.dodge(knife);
        thirdBaby.attack(thirdBaby.hands, knife);
        knife.shatter();
        monster.afraid();
        monster.see(knife);
        monster.angry(2);
        thirdBaby.attack(thirdBaby.hands, knife);
        knife.hole();
        monster.see(knife);
        thirdBaby.laugh(true);
        monster._throw(knife);
        monster.angry(3);
        monster.changeHandPart();
        monster.attack(monster.pliers, thirdBaby.arms);
        thirdBaby.speak("诶，来吧");
        monster.pliers.shatter();
        monster.angry(3);
        monster.regeneration();
        thirdBaby.speak("再来啊");
        monster.attack(monster.pliers, thirdBaby.arms);
        monster.hurt();
        thirdBaby.laugh(true);
        monster.angry(4);
        monster.changeHandPart();
        monster.toWind();
        monster.run();
        thirdBaby.speak("你想跑？");
        thirdBaby.runAfter(monster);
        thirdBaby.speak("哪里走！");
    }

    public ThirdBaby thirdBaby;
    public Monster monster;
    public Being knife;
    public Being ground;
}
