package S191220181;

public class Scene {
    Sanwa sanwa;
    Monster snake;
    Monster scorpion;
    Monster frog;
    Monster wugong;


    public Scene() {
        sanwa = new Sanwa("三娃");
        snake = new Monster("蛇精");
        scorpion=new Monster("蝎子精");
        frog = new Monster("青蛙精");
    }

    public void play() {
        sanwa.speakTo(snake,"你到底要打什么地方");
        snake.think("这娃子肯定有弱点");
        snake.speakTo(sanwa,"你转过身，让我康康！");
        sanwa.turn();
        sanwa.protect();
        snake.laugh(sanwa);
        snake.speakTo(sanwa,"你能挺住我三棍，我就投降");
        sanwa.think("我刀枪不入还怕你打棍子");
        sanwa.speakTo(snake,"你又不是我妈，真不要脸");
        snake.speakTo(sanwa,"今儿老娘非打你不可");
        sanwa.speakTo(snake,"谁……谁怕你啦！");
        snake.hit(sanwa);
        sanwa.verb();
        snake.laugh(sanwa);
        snake.speakTo(sanwa,"你躲什么");
        sanwa.speakTo(snake,"谁躲了，我抓抓痒不行吗");
        snake.hit(sanwa);
        sanwa.verb();
        snake.laugh(sanwa);
        snake.speakTo(sanwa,"你的弱点被我找到了");
        snake.shoe(sanwa);
        sanwa.move("试图逃脱");
        sanwa.trap();
        snake.runafter(sanwa);
        snake.hit(sanwa);
        snake.speakTo(scorpion,"你们快出来，把他抬走");
        frog.pick(sanwa);
        scorpion.speakTo(snake,"你真彳亍！");
        scorpion.move("去向葫芦娃老巢");
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
