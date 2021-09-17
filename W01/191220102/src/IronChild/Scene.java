package IronChild;

public class Scene {
    Sword sword;
    Monster snake;
    Monster scorpion;
    Huluwa iron;

    public Scene() {
        sword = new Sword("刚柔阴阳剑");
        snake = new Monster("蛇精", 100, 20, 10, 5);
        scorpion = new Monster("蝎子精", 200, 30, 20, 2);
        iron = new Huluwa("铁娃", 300, 10, 100, 3);
        iron.gift();
    }

    public void play() {
        sword.appear();
        sword.big();
        sword.hard();
        snake.hardSword();
        snake.swingSword(3);
        iron.speakTo(snake, "哈哈哈哈哈哈哈。");
        snake.speakTo(iron, "啊？你难道不怕我这宝剑呐？");
        iron.speakTo(snake, "你干脆把所有的兵器都拿出来吧，我还可以陪你玩玩。");
        snake.speakTo(iron, "哼！只要你顶得住我三剑，我就缴械投降还你哥哥。");
        iron.speakTo(snake, "好！说话算数。");
        iron.jump();
        iron.speakTo(snake, "诶，来吧。");
        snake.speakTo(iron, "好！");
        iron.speakTo(snake, "诶！慢着！谁要是赖皮，谁就是孬种。");

        snake.speakTo(iron, "看剑！");
        snake.attack(iron, snake.attack);
        iron.speakTo(snake, "1");

        snake.swingSword(3);
        snake.attack(iron, snake.attack);
        iron.speakTo(snake, "2");
        scorpion.speakTo(iron, "啊？");
        iron.speakTo(snake, "哈哈，到底是个女人。我的头可不是面团捏的。最后一下了，你可得把劲都使出来啊！");
        snake.speakTo(iron, "哼！铁娃子，可别心急啊。你还不知道这刚柔阴阳剑的厉害呢。好！你等着。");

        snake.dance();
        sword.soft();
        snake.softSword();
        snake.speakTo(iron, "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈。");
        iron.struggle();
        scorpion.speakTo(iron, "呵呵哈哈哈哈哈哈哈哈哈。");
        iron.trap();
        snake.speakTo(iron, "哼。铁娃子，女人的软刀子滋味怎么样呀，嗯？哈哈哈哈。");
    }

    //7:45-9:30
    public static void main(String[] args) {
        new Scene().play();
    }
}
