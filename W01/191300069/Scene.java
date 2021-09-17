public class Scene {
    GourdEssence ge_three;
    Goblin greenSnake;
    Goblin crocodile;
    Goblin toad;
    Goblin bat;
    Sword sword;
    Chain chain;
    Hammer hammer;
    public Scene() {
        ge_three = new GourdEssence("ge_three");
        greenSnake = new Goblin("greenSnake", 100, 3, 1, 4);
        crocodile = new Goblin("crocodile", 50, 3, 1, 3);
        toad = new Goblin("toad", 30, 2, 0, 2);
        bat = new Goblin("bat", 30, 2, 0, 2);
        sword = new Sword("sword");
        chain = new Chain("chain");
        hammer = new Hammer("hammer");
    }
    public void play(){
        //3:55
        ge_three.talkTo(greenSnake, "可惜平头剑不会长个儿，留着它干啥，你还有什么法宝？快使出来吧！");
        greenSnake.talkTo(ge_three, "铁娃匝，你急什么，看！");
        sword.revive();
        greenSnake.talkTo(ge_three, "蛤！我的宝剑就是会长个儿！这下看你能砍得断吗？");
        greenSnake.act("point at", ge_three, sword);
        for(int i = 0; i < 5; i++){
            greenSnake.talkTo(ge_three, "弄欧~");
            ge_three.act("cut off", sword);
            sword.revive();
        }
        greenSnake.act("laugh a hearty laugh");
        ge_three.act("pant for breath");
        greenSnake.act("attack", ge_three, sword);
        ge_three.act("dodge the attack");
        ge_three.act("run away");
        toad.act("tighten", chain, bat);
        bat.act("tighten", chain, toad);
        chain.trip(ge_three);
        chain.twine(ge_three);
        ge_three.act("throw", toad, chain);
        ge_three.act("throw", bat, chain);
        toad.act("fly in the air");
        bat.act("fly in the air");
        chain.beSmashed(ge_three);
        toad.act("fall to the ground");
        toad.underAttack(ge_three.strength);
        bat.act("hang from trees");
        bat.underAttack(ge_three.strength);
        ge_three.act("open the big mouth and laugh wildly");
        ge_three.act("continue to run forward");
        crocodile.act("raise", hammer);
        crocodile.attack(ge_three, hammer);
        hammer.hit(ge_three);
        ge_three.say("啊蛤..");
        ge_three.act("fall to the ground");
        crocodile.say("哼哼嗯？");
        crocodile.act("go up and check the situation of", ge_three);
        crocodile.see(ge_three, "in a coma");
        crocodile.say("啊哈哈哈哈哈哈哈哈哈哈哈~");
        //4:55
    }

    public static void main(String[] args) {
        new Scene().play();
    }
}