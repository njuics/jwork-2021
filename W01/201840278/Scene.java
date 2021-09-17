public class Scene {
    Monster snake;
    Monster scorpion;
    Human boy1;
    Human boy2;
    Door door;
    Object wall;
    Bat bat;
    BottleOfWine wine;
    public Scene() {
        snake = new Monster("蛇精");
        scorpion = new Monster("蝎子精");
        boy1 = new Human("四娃", "绿", "吐火");
        boy2 = new Human("六娃", "蓝", "隐身");
        door = new Door();
        wall = new Object();
        bat = new Bat();
        wine = new BottleOfWine();
    }

    public void play() {
        scorpion.stand();
        scorpion.speakTo(snake,"快掌灯生火，共进家宴");
        scorpion.sit();

        boy1.stand();
        boy1.speakTo(scorpion,"慢，用不着费那力气，看我的");
        boy1.useSkill(50);
        Fire fire = new Fire();
        fire.burn(wall,30);
        bat.flyAway();
        fire.burn(wine,50);
        boy1.drink(wine,100);
        boy1.sit();

        snake.speakTo(boy1,boy2,"二位兄弟大驾光临为洞府增辉啊");

        scorpion.speakTo(boy1,boy2,"你们真是神通广大，佩服佩服");

        boy2.speakTo(scorpion,snake,"妖怪快还我哥哥");

        scorpion.speakTo(boy1,boy2,"误会,二位的兄长正在睡觉，请看");

        door.open();
    }

    public static void main(String []args) {
        new Scene().play();
    }
}
