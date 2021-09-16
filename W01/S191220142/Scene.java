public class Scene {
    Weapon sword;
    Monster snake;
    Monster scorpion;
    Sanwa sanwa;

    public Scene(){
        sword = new Weapon("刚柔阴阳剑", 100);
        snake = new Monster("蛇精", 200, 10, 20, 2);
        scorpion = new Monster("蝎子精", 500, 50, 50, 2);
        sanwa = new Sanwa("三娃", 400, 30, 50, 2);
    }

    public void play(){
        sanwa.speakTo(snake, "你有什么本事，哎，就拿出来吧");

        snake.speakTo(sanwa, "好");
        snake.useWeapon(sword);
        snake.shout();

        sanwa.laugh();
        snake.speakTo(sanwa, "啊？你难道不怕我这宝剑吗？");
        sanwa.speakTo(snake, "你干脆把所有的兵器都拿出来吧，我还可以陪你玩玩~");
        snake.speakTo(sanwa, "只要你顶得住我三剑，我就缴械投降，还你哥哥");
        sanwa.speakTo(snake, "好，说话算数");

        sanwa.move();
        sanwa.harder();
        sanwa.speakTo(snake, "欸，来吧");
        snake.speakTo(sanwa, "好！");
        sanwa.speakTo(snake, "欸，慢着，谁要是赖皮，谁就是孬种");

        snake.speakTo(sanwa, "看剑！");
        snake.attack(sanwa);
        sanwa.speakTo(snake, "1");

        snake.shout();
        snake.attack(sanwa);
        sanwa.speakTo(snake, "2");
        scorpion.shock();

        sanwa.laugh();
        sanwa.speakTo(snake, "到底是个女人，我的头可不是面团捏的");
        sanwa.speakTo(snake, "最后一下了，你可得把劲全使出来啊~");
        snake.speakTo(sanwa, "哼，铁娃子，可别心急啊，你还不知道这刚柔阴阳剑的厉害呢");

        snake.speakTo(sanwa, "好，你等着");
        snake.dance();
        snake.laugh();
        snake.loseWeapon(sword);

        sanwa.shout();
        snake.laugh();
        scorpion.laugh();
        snake.speakTo(sanwa, "铁娃子，女人的软刀子滋味怎么样啊？嗯？");
        snake.laugh();
        sanwa.shout();
    }
    
    public static void main(String[] args){
        new Scene().play();
    }
}