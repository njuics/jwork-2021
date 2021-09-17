package liuwanb;

public class Scene {

    LiuWa liuwa;
    Scorpion scorpion;
    Snake snake;
    Monster xiaolouluo;
    Cobweb cobweb;
    Rock rock;

    public Scene() {
        liuwa = new LiuWa();
        scorpion = new Scorpion();
        snake = new Snake();
        xiaolouluo = new Monster();
        cobweb = new Cobweb();
        rock = new Rock();
    }

    public void play() {
        System.out.print("葫芦兄弟第十集——捕风捉影\n");
        liuwa.fadeOut();
        liuwa.laugh();
        liuwa.kick(scorpion);
        scorpion.attack(liuwa);
        scorpion.attack(liuwa);
        scorpion.beAngry();
        scorpion.speakTo(xiaolouluo,"快去抓住他！");
        liuwa.laugh();
        xiaolouluo.search(liuwa);
        xiaolouluo.speakTo("光听见声音，人呢？");
        liuwa.visuallyInduce(xiaolouluo);
        liuwa.taunt(xiaolouluo);
        snake.search(liuwa);
        snake.speakTo(xiaolouluo,"快用蛛网");
        xiaolouluo.useItem(cobweb,liuwa);
        xiaolouluo.speakTo(liuwa,"哈哈总算抓住你了，我看你再跑！");
        liuwa.escape();
        liuwa.move();
        liuwa.useItem(rock,scorpion);
        scorpion.beAngry();
        scorpion.speakTo(xiaolouluo,"快抓住他！");

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}

