public class Scene {
    erwa erwa_;
    Monster snake;
    Monster scorpion;
    Monster frogBoss;
    Stone stone;

    public Scene() {
        erwa_ = new erwa("二娃");
        snake = new Monster(200, 10, 20, "蛇精");
        scorpion = new Monster(500, 50, 50, "蝎子精");
        frogBoss = new Monster(100, 5, 10, "蛤蟆头领");
        stone = new Stone();
    }

    public void play() {
        snake.speakTo(snake, "睡吧睡吧(自言自语)");
        scorpion.speakTo(snake, "这宝贝可真神啊……");
        erwa_.openEye();
        snake.isLooked();
        snake.speakTo(scorpion, "这是什么光……");
        scorpion.speakTo(snake, "待我去查看查看");
        stone.open();
        scorpion.look();
        scorpion.speakTo(snake, "又是一个葫芦娃……");
        snake.speakTo(scorpion, "不好，这第二个葫芦娃……");
        stone.close();
        scorpion.speakTo(frogBoss, "蛤蟆头领！");
        frogBoss.speakTo(scorpion, "在！");
        scorpion.speakTo(frogBoss, "把那老头和葫芦娃……");
        snake.speakTo(scorpion, "轻点声");
        frogBoss.jump(scorpion);
        scorpion.speakTo(frogBoss, "关到十八层地洞里去(小声)");

        erwa_.listen("把那老头……关到十八层……里去");

    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
