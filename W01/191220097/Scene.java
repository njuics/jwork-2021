public class Scene {
    Calabash calabashThree;
    Monster snake;
    Monster scorpion;

    public Scene() {
        calabashThree = new Calabash(1000, 20, 1000, "三娃");
        snake = new Monster(200, 15, 30, 2, "蛇精");
        scorpion = new Monster(400, 25, 40, 2, "蝎子精");
    }

    public void play() {
        calabashThree.speakTo(snake, "我来了！");
        calabashThree.breakItems("魔镜");

        snake.mood("惊怒且痛苦");
        scorpion.mood("无能狂怒,嚎啕大哭");
        scorpion.action("颤抖的手捧着稀碎的魔镜");

        calabashThree.speakTo(snake, "你们这些害人精还不快投降！");

        snake.rolleyes();
        snake.mood("嚣张大笑");
        snake.speakTo(calabashThree, "你凭着一身钢筋铁骨就如此夸口，你可知道老娘的厉害！");

        calabashThree.mood("不屑大笑");
        calabashThree.speakTo(snake, "你有什么本事，诶！就拿出来吧！");

        snake.speakTo(calabashThree, "好哇！");
        snake.action("挥动宝剑");

        calabashThree.action("哈哈大笑");

        snake.mood("感到被狠狠地挑衅了");
        snake.speakTo(calabashThree, "你难道不怕我这宝剑？");

        calabashThree.mood("满不在乎");
        calabashThree.speakTo(snake, "你干脆把所有的兵器都拿出来吧，我还可以陪你玩玩~");

        snake.speakTo(calabashThree, "只要你顶得住我三剑，我就缴械投降还你哥哥");

        calabashThree.mood("大大的眼睛里写满了天真");
        calabashThree.speakTo(snake, "好，说话算话！诶，慢着，谁要是赖皮，谁就是孬种！");

        snake.speakTo(calabashThree, "看剑！");
        snake.attack(calabashThree, 20);
        snake.attack(calabashThree, 20);

        calabashThree.speakTo(snake, "到底是个女人，我的头可不是面团捏的！");
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
