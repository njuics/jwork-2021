package CalabashBoys;

public class Scene {
    CalabashBoy calabashBoy;
    Butterfly butterfly;
    Bat bat;
    Snake snake;
    Lotus lotus;
    Leaf leaf;

    public Scene(){
        calabashBoy=new CalabashBoy();
        butterfly=new Butterfly();
        bat=new Bat();
        snake=new Snake();
        lotus=new Lotus();
        leaf=new Leaf();
    }

    public void play(){
        butterfly.talk(calabashBoy, "这是百草的甘露，天地间的精华。它是花中的琼浆，喝了它，幽香缭绕，如仙如梦，如痴如醉。");
        butterfly.grab(lotus.grabFromLotus());
        butterfly.talk(calabashBoy,"一切烦恼，都会消失的。");
        butterfly.handTo(calabashBoy, butterfly.possession.get(0));
        calabashBoy.drink();
        calabashBoy.talk(butterfly, "哎，好喝，好喝。");
        calabashBoy.drinkFromLotus();
        butterfly.talk(calabashBoy, "啊，小哥哥，你可不能多喝啊");
        calabashBoy.talk(butterfly, "好喝，好，好喝，嗯...");
        calabashBoy.getDrunk();
        calabashBoy.eyeGlow();
        calabashBoy.drunkTalk("咦哟，哎哟，好喝，好喝，嗯好，好，好，好，啊嗯。");
        calabashBoy.blackout();
        butterfly.lieDown();
        butterfly.talk(calabashBoy, "小哥哥，小哥哥，你快醒醒啊。");
        bat.push(leaf);
        bat.laugh();
        bat.fly();
        bat.talk("太好了，太好了，嘿嘿。");
        bat.talk(butterfly, "好你个小妖精，磨磨蹭蹭尽想着这个蛮小子，哼，会有你好日子的。");
        bat.attack(butterfly);
        bat.stealGemStone(calabashBoy);
        bat.talk("啊，宝贝。");
        bat.possession.get(0).shine();
        bat.handTo(snake, bat.possession.get(0));
        snake.laugh();
        snake.talk("这个金刚葫芦娃这下可完蛋了。");
        snake.possession.get(0).shine();
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}
