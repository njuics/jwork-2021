package W01.S181860072.src;

public class Scene {
    Monster crocodile;
    Monster snake;
    Monster shrimp;
    Monster frog;
    Monster mouse;
    Elixir elixir;

    public static void main(String[] args){
        new Scene().play();
    }
    public Scene(){
        crocodile=new Monster(200,100,20,2);
        mouse = new Monster(100, 50, 5, 1);
        shrimp = new Monster(100, 50, 5, 1);
        frog =new Monster(200, 100, 20, 2);
        snake = new Monster(1000, 200, 40, 4);
        elixir = new Elixir();
    }
    public void play(){
        crocodile.speakTo(crocodile, "嗯 七星丹 啊 七星丹 大王 你看这七星丹练成了!");
        elixir.twinkling();
        snake.speakTo(snake, "嘿嘿");
        frog.speakTo(snake, "恭喜大王，贺喜大王，七星丹终于练~练~练~练~练成了。");
        shrimp.speakTo(shrimp, "哎嘿");
        mouse.speakTo(mouse,"哎嘿");
        elixir.twinkling();
        frog.moveAct("蹑手蹑脚走到七星丹前");
        frog.pickThing(elixir);
        frog.moveAct("吹气");
        frog.facialExpression("眼珠飞快转动");
        frog.moveAct("向青蛇大王呈上七星丹。");
        frog.passThing(snake);
        snake.speakTo(snake, "这七星丹可来之不易啊，我姐姐姐夫为了它，捞了个粉身碎骨，今天深仇已报，大功告成。我借此吉庆之时，告慰姐姐姐夫的在天之灵。");
        snake.facialExpression("泪流满面");
        frog.speakTo(snake, "这葫芦兄弟在劫难逃，今天总算被大王练成了七星神丹，这是老天有眼，也是大王的鸿福。大王吃了这七星丹将与日月共存，无敌天下。小的们靠大王的神威也有好日子过了~");
    }
}
