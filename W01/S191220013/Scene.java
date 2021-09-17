
public class Scene {
    Monster snake;
    Monster scorpion;
    Hulu huluwa;
    Fork fork;

    public Scene() {
        fork = new Fork();
        snake = new Monster(200, 10, 20, 2);
        scorpion = new Monster(500, 50, 50, 2);
        huluwa =  new Hulu();
    }
    public void play() {
        huluwa.speakTo(snake, "妖精，快还我爷爷，快还我爷爷！");

        snake.rolleyes();
        snake.speakTo(huluwa, "可以，可以， 你这娃娃倒是一片孝心。你爷爷就在这，你亲妈也在这，快给我磕头。");

        huluwa.speakTo(snake, "呸，真不要脸。");

        scorpion.laugh();
        
        huluwa.speakTo(snake, "今天，要是不把我爷爷放了，我就把你这妖洞砸得粉碎。");

        scorpion.laugh();
        scorpion.throwFork(fork, huluwa);
        huluwa.breakFork(fork);
        huluwa.throwFork(fork, scorpion);
        huluwa.laugh();
        snake.attack(huluwa, 2);
    }
    
    public static void main(String[] args) {
        new Scene().play();
    }

}
