package W01.example;

public class Scene {

    SpiderWeb spiderWeb;
    Human oldman;
    Monster snake;
    Monster scorpion;

    public Scene() {
        spiderWeb = new SpiderWeb();
        oldman = new Human();
        snake = new Monster(200, 10, 20, 2);
        scorpion = new Monster(500, 50, 50, 2);
    }

    public void play() {
        spiderWeb.open();

        snake.speakTo(oldman, "老人家...");
        oldman.speakTo(snake, "what?...");

        snake.speakTo(oldman, "老人家...");
        scorpion.speakTo(oldman, "这是我们...");
        snake.speakTo(oldman, "Come on...");

        oldman.speakTo(snake, "fxxk...");
        oldman.attack(snake, 2);

        scorpion.bePissed();
        scorpion.move();
        scorpion.speakTo(oldman, "wanna die?");

        scorpion.attack(oldman, 10);
        snake.speakTo(scorpion, "dear...");
        scorpion.rolleyes();

        spiderWeb.close();

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
