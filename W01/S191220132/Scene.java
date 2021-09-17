package W01.S191220132;

public class Scene {

    Ground ground;
    Gourdman threeboy;
    Monster snake;
    Monster scorpion;

    public Scene() {
        ground = new Ground();
        threeboy = new Gourdman(100, 75, 500, 0);
        snake = new Monster(200, 10, 20, 2);
        scorpion = new Monster(500, 50, 50, 2);
    }

    public void play() {
        ground.open();

        snake.laugh();
        scorpion.laugh();

        threeboy.beTied();

        snake.speakTo(threeboy, "三娃子，就算你天生一副铜头铁臂刀枪不入"
        +"\n"+"也斗不过我这把刚柔阴阳剑呐"
        +"\n"+"这会可尝到了你姑奶奶的厉害了吧！！！嗯？");
        snake.bePissed();

        scorpion.speakTo(threeboy, "哼你这个龟孙子"
        +"\n"+"你还有多大能耐，快使出来吧 昂");
        scorpion.ridicule("踱步到三娃旁挥手手");

        scorpion.attack(threeboy, 1);
        scorpion.attack(threeboy, 1);
        scorpion.attack(threeboy, 1);

        threeboy.attack(scorpion,10);
        scorpion.bleed(10);
        threeboy.attack(scorpion,15);

        scorpion.ridicule("lueluelue");

        snake.speakTo(threeboy, "好小子你砸了我的魔镜还要撒野？"
        +"\n"+"我非把你焖在炼丹炉里！");
        scorpion.speakTo(threeboy, "熬成肉酱！！！！"
        +"\n"+"炼成七星丹！！！");
        snake.bePissed();
        scorpion.bePissed();

        snake.doMagic("闪电鞭");
        ground.open();

        threeboy.speakTo(threeboy, "兄弟们 快来消灭妖精！！！！！！");
        threeboy.beDropped();

        scorpion.speakTo(snake, "抓了葫芦娃趁早把炼丹神炉弄到手"
        +"\n"+"免得夜长梦多");
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
