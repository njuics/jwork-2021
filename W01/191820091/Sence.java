public class Sence {
    CalabashBrother calabashBrother;
    Snake snake;
    Sword sword;

    public Sence() {
        calabashBrother = new CalabashBrother("葫芦娃", 100, 10, 100);
        snake = new Snake("蛇精", 50, 20, 50);
        sword = new Sword("宝剑", 0, 100);
    }

    public void play() {
        calabashBrother.speakTo(snake, "哈哈哈哈");
        snake.speakTo(calabashBrother, "你难道不怕我的宝呐？");
        calabashBrother.speakTo(snake, "我还可以陪你玩玩");
        snake.speakTo(calabashBrother, "只要你抵得住我三剑，我就放你哥哥");
        calabashBrother.speakTo(snake, "说话算数");

        calabashBrother.move("从石头上跳下来");

        calabashBrother.speakTo(snake, "来吧");
        snake.speakTo(calabashBrother, "好");
        calabashBrother.speakTo(snake, "哎，慢着，谁要是耍赖皮谁就是小狗");
        snake.speakTo(calabashBrother, "看剑");

        snake.useWeapon();
        sword.attack();
        calabashBrother.beAttacked(sword.type, sword.hurt);
        snake.useWeapon();
        sword.attack();
        calabashBrother.beAttacked(sword.type, sword.hurt);

        calabashBrother.speakTo(snake, "呵呵，女人，力气太小了");
        snake.speakTo(calabashBrother, "别高兴太早");

        sword.changeSwordType(1);
        calabashBrother.beAttacked(sword.type, sword.hurt);
    }

    public static void main(String[] args) {
        new Sence().play();
    }
}
