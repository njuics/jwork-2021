package S218354149;

public class Scene {
    Monster snake;
    Monster scorpion;
    Monster spiders;
    Human huluwa;
    Spiderweb spiderweb;

    public Scene() {
        // 第三集 08:39 - 09:36
        snake = new Monster("蛇精", 200, 30, 10);
        scorpion = new Monster("蝎子", 200, 30, 10);
        spiders = new Monster("小蜘蛛", 50, 10, 5);

        huluwa = new Human("大哥");

        spiderweb = new Spiderweb();
    }

    public void play() {
        spiderweb.change();

        scorpion.emotion(scorpion, "laugh");

        snake.speakTo(huluwa, "喂～葫芦娃～怎么样啊？做了个好梦吧？我告诉你，你的丹田已经被我封住了！你就别想再撒野了！");

        spiders.pullString(huluwa);

        snake.speakTo(huluwa, "啊！我真不想杀掉你。你又嫩又蛮又可爱，真讨人喜欢！你只要愿意呀….mua~mua~~你就做我的娃子吧！");
        scorpion.emotion(scorpion, "laugh");

        huluwa.attack(snake, 5);
        huluwa.attack(scorpion, 5);

        huluwa.emotion(huluwa, "laugh");

        scorpion.emotion(scorpion, "pissed");
        snake.emotion(snake, "pissed");

        scorpion.throwSword(huluwa);
        scorpion.attack(huluwa, 3);
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
