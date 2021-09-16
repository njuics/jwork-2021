public class Scene {
    Environment river,cave;
    Magician fireman,waterman;
    Monster snake;
    Monster scorpion;

    public Scene() {
        river = new Environment("river");
        cave = new Environment("cave");
        fireman = new Magician("fireman");
        waterman = new Magician("waterman");
        snake = new Monster(200, 10, 20, 2,"snake");
        scorpion = new Monster(500, 50, 50, 2,"scorpion");
    }

    public void play()
    {
        snake.speakTo(waterman,"这个地方叫乌龟盼水，这条阴河已经干了三百年了，如果有了水，乌龟就会驮我们过河。可这老是干个底朝天，我们又得绕远路了。");
        waterman.speakTo(snake, "别拐弯抹角的了，这有什么难？");
        waterman.useMagic(river, 10, "filled with water");
        snake.surprise();
        waterman.move(river);
        fireman.move(river);
        snake.move(river);
        waterman.laugh();

        snake.speakTo(fireman, "呵呵，请，请喝。");
        scorpion.speakTo(fireman, "哈哈，来，咱们干，干。");
        fireman.speakTo(scorpion, "这酒倒是非常香，可惜太冷了一点儿，这洞……也是又冷又暗。");
        waterman.speakTo(scorpion, "坐在这冷板凳上，屁股都发凉。");
        fireman.look(cave);
        scorpion.speakTo(fireman, "对对对，来啊，快掌灯生火，共庆佳宴！");
        fireman.speakTo(scorpion, "慢，用不着费那力气，看我的！");
        fireman.useMagic(cave, 10, "on fire");
        snake.surprise();
        scorpion.surprise();
    }
    public static void main(String [] args) {
        new Scene().play();
    }
}
