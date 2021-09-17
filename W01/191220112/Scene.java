public class Scene {

    Human oldman;
    Monster snake;
    Monster scorpion;
    Minion minion;
    Entity baolian;

    public Scene() {
        oldman = new Human("oldman");
        snake = new Monster("snake", 200, 10, 20, 2);
        scorpion = new Monster("scorpion", 500, 50, 50, 2);
        minion = new Minion("minion", 100, 5, 10, 1);
        baolian = new Entity("baolian");
    }

    public void play() {
        oldman.laugh();
        scorpion.speakTo(oldman, "老家伙，我把你也扔到炉里去，叫你知道厉害！！");

        oldman.speakTo(scorpion, "就是把我烧成灰，也别想炼出七心丹！这七个葫芦娃，全给你们折腾得离心离德，怎么能合到一块去呢！");
        snake.beSurprised();
        snake.wink();
        snake.rolleyes();
        scorpion.wink();

        oldman.speakTo(snake, "我倒是有办法叫他们回心转意。");
        scorpion.speakTo(oldman, "你？？");
        snake.speakTo(minion, "把老头儿放开，看看他有多大的能耐！");

        minion.untie(oldman);
        oldman.stretchArms();
        snake.wink();
        scorpion.wink();
        oldman.stretchArms();
        
        oldman.takeOut(null);
        snake.wink();
        oldman.takeOut(baolian);

        oldman.speakTo(snake, "莲心莲心，连成一心!葫芦娃有了它，就能齐心合力，消灭你们这些妖精。");
        baolian.shine();
        oldman.laugh();

        snake.speakTo(scorpion, "不好，我们上当啦！");
        scorpion.bePissed();
        minion.beAfraid();

        oldman.throwOut(baolian);
        oldman.laugh();
        baolian.open();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
